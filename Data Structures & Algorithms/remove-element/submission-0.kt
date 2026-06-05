class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val cnt = nums.count { num -> num != `val`}
        var k = 0
        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[k] = nums[i]
                k++
            }
        }
        return cnt
    }
}
