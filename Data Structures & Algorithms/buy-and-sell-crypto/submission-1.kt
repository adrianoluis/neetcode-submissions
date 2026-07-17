class Solution {
    fun maxProfit(prices: IntArray): Int {
        var ans = 0
        var buy = -1
        for (i in prices.indices) {
            if (buy == -1 || buy > prices[i]) {
                buy = prices[i]
            }
            val profit = prices[i] - buy
            if (profit > ans) {
                ans = profit
            }
        }
        return ans
    }
}
