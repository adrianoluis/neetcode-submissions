class Solution {
    fun majorityElement(nums: IntArray): Int {
        val counter = mutableMapOf<Int, Int>()
        for (n in nums) {
            var c = counter[n] ?: 0
            counter[n] = ++c
            if (c > nums.size / 2) {
                return n
            }
        }
        return 0
    }
}
