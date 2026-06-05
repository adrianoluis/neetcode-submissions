import kotlin.math.max

class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var count = 0
        var tmp = 0
        for (bin in nums) {
            if (bin == 1) {
                tmp++
            } else {
                tmp = 0
            }
            if (tmp > count) count = tmp 
        }
        return count
    }
}
