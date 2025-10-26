class Solution {
   fun corpFlightBookings(bookings: Array<IntArray>, n: Int): IntArray {
    val result = IntArray(n)
    for (arr in bookings){
        val first = arr[0]
        val last = arr[1]
        val seats = arr[2]
        for (i in first..last){
            result[i-1] +=  seats
        }
    }
    return result
}
}