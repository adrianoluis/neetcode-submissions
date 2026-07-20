class Solution {
    fun majorityElement(nums: IntArray): Int {
        val counter = mutableMapOf<Int, Int>()
        var ans = IntArray(2)
        for (n in nums) {
            var c = counter[n] ?: 0
            counter[n] = ++c
            if (c > ans[1]) {
                ans[0] = n
                ans[1] = c
            }
        }
        return ans[0]
    }
}
