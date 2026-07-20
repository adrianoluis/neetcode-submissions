class Solution {
    fun majorityElement(nums: IntArray): Int {
        val counter = mutableMapOf<Int, Int>()
        var ans = IntArray(2)
        nums.forEach { i ->
            var c = counter[i] ?: 0
            c++
            if (c > ans[1]) {
                ans[0] = i
                ans[1] = c
            }
            counter[i] = c
        }
        return ans[0]
    }
}
