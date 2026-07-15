class Solution {
    fun isPalindrome(s: String): Boolean {
        var newS = s.replace("\\W+".toRegex(), "").lowercase()
        var i = 0
        var j = newS.length - 1
        while (i < j) {
            if (newS[i++] != newS[j--]) return false
        }
        return true
    }
}
