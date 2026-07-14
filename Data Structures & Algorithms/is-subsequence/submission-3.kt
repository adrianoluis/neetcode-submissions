class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var i = 0
        for (c in t) {
            if (i < s.length && s[i] == c) i++
        }
        return i == s.length
    }
}
