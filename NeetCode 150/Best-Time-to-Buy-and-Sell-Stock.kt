class Solution {
fun maxProfit(prices: IntArray): Int {
    var left = 0
    if (prices.size  == 1) return 0
    var maxProfit = 0
    for (right in 1 until prices.size ) {
        if (prices[left] >= prices[right]) {
            left = right
            continue
        } else {
            maxProfit = max(maxProfit, prices[right] - prices[left])
        }

    }
    return maxProfit
}
}