class DynamicArray(capacity: Int) {

    private var nums = IntArray(capacity)

    private var l = 0

    fun get(i: Int): Int {
        if (i >= nums.size) return 0
        return nums[i]
    }

    fun set(i: Int, n: Int) {
        if (i >= nums.size) {
            resize()
        }
        nums[i] = n
        if (i >= l) {
            l = i
        }
    }

    fun pushback(n: Int) {
        if (l == nums.size) {
            resize()
        }
        nums[l] = n
        l++
    }

    fun popback(): Int {
        l--
        val n = nums[l]
        nums[l] = 0
        return n
    }

    private fun resize() {
        val newNums = IntArray(nums.size * 2)
        for (i in nums.indices) {
            newNums[i] = nums[i]
        }
        nums = newNums
    }

    fun getSize(): Int {
        return l
    }

    fun getCapacity(): Int {
        return nums.size
    }
}

