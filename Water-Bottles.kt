class Solution {
   fun numWaterBottles(numBottles: Int, numExchange: Int): Int {
    var full = numBottles
    var total = 0
    var empty = 0
    while (full > 0) {
        total += full             
        empty += full             
        full = empty / numExchange 
        empty %= numExchange
    }
    return total
}
}