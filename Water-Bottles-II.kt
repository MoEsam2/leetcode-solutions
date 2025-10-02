class Solution {
    fun maxBottlesDrunk(numBottles: Int, numExchange: Int): Int {
   var full = numBottles
    var total = 0
    var empty = 0
    var k = numExchange
    while (full > 0) {
        total += full
        empty += full
        full = 0
        while (empty >= k) {
            empty -= k
            full += 1
            k += 1
        }
    }
    return total
    }
}