class Solution {
    fun majorityElement(nums: IntArray): Int {
        var count = 0
        var candidate = 0
        for (n in nums) {
            if (count == 0) {
                candidate = n
            }
            if (n == candidate) {
                count++
            } else {
                count--
            }
        }
        return candidate
    }
}
