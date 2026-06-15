class MinStack() {

    private var nums = IntArray(5)

    private var l = 0

    private fun resize() {
        val newNums = IntArray(nums.size * 2)
        for (i in nums.indices) {
            newNums[i] = nums[i]
        }
        nums = newNums
    }

    fun push(`val`: Int) {
        if (l == nums.size) {
            resize()
        }
        nums[l] = `val`
        l++
    }

    fun pop() {
        l--
    }

    fun top(): Int {
        if (nums.isEmpty()) return 0
        return nums.take(l).last()
    }

    fun getMin(): Int {
        if (nums.isEmpty()) return 0
        return nums.take(l).min()
    }
}
