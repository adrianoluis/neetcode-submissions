class Solution {
    companion object {
        val BRACKETS = mapOf(
            '(' to ')',
            '[' to ']',
            '{' to '}',
        )
    }

    private val brackets = mutableListOf<Char>()

    fun isValid(s: String): Boolean {
        if (s.isEmpty() || s.length <= 1) return false
        s.forEach { char ->
            if (BRACKETS.keys.contains(char)) {
                brackets.add(char)
                return@forEach
            }
            if (brackets.isEmpty()) return false
            val pairEntry = BRACKETS.entries.find { it.value == char }
            if (brackets.last() != pairEntry?.key) return false
            brackets.removeLast()
        }
        return brackets.isEmpty()
    }
}
