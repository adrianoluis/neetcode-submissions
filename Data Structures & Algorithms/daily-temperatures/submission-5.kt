class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val n = temperatures.size
        val result = IntArray(n)
        val stack = IntArray(n)
        var top = -1 // means empty stack
        for (i in temperatures.indices) {
            while (top >= 0 && temperatures[i] > temperatures[stack[top]]) {
                val prev = stack[top--]
                result[prev] = i - prev
            }
            stack[++top] = i
        }
        return result
    }
}
