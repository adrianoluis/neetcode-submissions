class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        var ans = x
        var div = 1L
        while (ans >= (10 * div)) {
            div *= 10
        }
        while (ans > 0) {
            val right = ans % 10
            val left = ans / div.toInt()
            if (left != right) return false
            ans = (ans % div.toInt()) / 10
            div /= 100
        }
        return true
    }
}
