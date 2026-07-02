class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val ts = temperatures.size
        val result = IntArray(ts)
        for (i in temperatures.indices) {
            var daysCount = 0
            for (j in i until ts) {
                if (temperatures[i] < temperatures[j]) {
                    result[i] = daysCount
                    daysCount = 0
                    break
                }
                daysCount++
            }
        }
        return result
    }
}
