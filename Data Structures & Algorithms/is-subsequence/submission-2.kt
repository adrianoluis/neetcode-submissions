class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var i = 0
        for (chr in t) {
            if (i < s.length && s[i] == chr) {
                i++
            }
            if (i == s.length) {
                return true
            }
        }
        return i == s.length
    }
}
