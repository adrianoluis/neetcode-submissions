class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        val base = strs[0]
        var ans = ""
        for (i in base.indices) {
            for (s in strs) {
                if (i == s.length || s[i] != base[i]) {
                    return ans
                }
            }
            ans += base[i]
        }
        return ans
    }
}
