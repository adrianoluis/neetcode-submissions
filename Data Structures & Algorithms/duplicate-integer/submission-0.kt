class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val appeared = mutableListOf<Int>()
            for (n in nums) {
                if (!appeared.contains(n)) {
                    appeared.add(n)
                } else {
                    return true
                }
        }
        return false
    }
}