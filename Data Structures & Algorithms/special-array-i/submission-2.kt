class Solution {
    fun isArraySpecial(nums: IntArray): Boolean {
        if (nums.size == 1) return true
        var isEven = true
        for (i in nums.indices) {
            if (i == 0) {
                isEven = nums[i] % 2 == 0
            } else {
                val tmp = nums[i] % 2 == 0
                if (tmp == isEven) {
                    return false
                }
                isEven = tmp
            }
        }
        return true
    }
}