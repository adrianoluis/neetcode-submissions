class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val idxMap = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val curr = nums[i]
            val diff = target - curr
            if (idxMap.containsKey(diff)) {
                idxMap[diff]?.let { n ->
                    return@twoSum intArrayOf(n, i)
                }
            } else {
                idxMap[curr] = i
            }
        }
        return intArrayOf()
    }
}
