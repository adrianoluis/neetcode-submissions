class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val ans = IntArray(2 * nums.size)
        var idx = 0
        for (i in 0 until 2) {
            for (num in nums) {
                ans[idx++] = num
            }
        }
        return ans
    }
}
