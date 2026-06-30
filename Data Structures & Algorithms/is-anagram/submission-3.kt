class Solution {
    fun charCount(chars: CharArray) : Map<Char, Int> {
        val result = mutableMapOf<Char, Int>()
        for (i in chars.indices) {
             val curr = chars[i]
            result[curr] = (result[curr] ?: 0) + 1
        }
        return result
    }
    fun isAnagram(s: String, t: String): Boolean {
        val sMap = charCount(s.toCharArray())
        val tMap = charCount(t.toCharArray())
        return sMap == tMap
    }
}
