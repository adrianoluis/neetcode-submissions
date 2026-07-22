class Solution {
    fun isArraySpecial(nums: IntArray): Boolean {
        if (nums.size == 1) return true
        var i = 0
        var j = nums.size - 1
        while (i < j) {
            val ev1 = nums[i++] % 2 == 0
            if (i < j) {
                val ev2 = nums[i] % 2 == 0
                if (ev1 == ev2) return false
            }
        }
        return true
    }
}