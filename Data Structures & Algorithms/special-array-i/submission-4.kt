class Solution {
    fun isArraySpecial(nums: IntArray): Boolean {
        for (i in 1 until nums.size) {
            if ((nums[i - 1] and 1) == (nums[i] and 1)) {
                return false
            }
        }
        return true
    }
}