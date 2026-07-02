class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val res = IntArray(temperatures.size) { 0 }
        val stack = mutableListOf<Int>()

        for (i in temperatures.indices) {
            while (stack.isNotEmpty() && temperatures[i] > temperatures[stack.last()]) {
                val stackIdx = stack.removeLast()
                res[stackIdx] = i - stackIdx
            }
            stack.add(i)
        }

        return res
    }
}
