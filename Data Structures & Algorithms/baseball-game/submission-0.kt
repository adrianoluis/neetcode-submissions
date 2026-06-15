class Solution {
    companion object {
        const val SUM = "+"
        const val DOUBLE = "D"
        const val INVALIDATE = "C"
    }

    private val records = mutableListOf<Int>()

    fun isInteger(toCheck: String): Boolean {
        return toCheck.toIntOrNull() != null
    }

    fun calPoints(operations: Array<String>): Int {
        operations.forEach { opOrNum ->
            val value = opOrNum.toIntOrNull()
            when (opOrNum) {
                SUM -> {
                    val sum = records.takeLast(2).sum()
                    records.add(sum)
                }
                DOUBLE -> {
                    val lastDoubled = records.last() * 2
                    records.add(lastDoubled)
                }
                INVALIDATE -> records.removeLast()
                else -> value?.let(records::add)
            }
        }
        return records.sum()
    }
}
