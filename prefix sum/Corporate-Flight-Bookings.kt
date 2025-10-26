class Solution {
fun corpFlightBookings(bookings: Array<IntArray>, n: Int): IntArray {
    val arr = IntArray(n + 1)
    for (booking in bookings) {
        val (first, last, seats) = booking
        arr[first - 1] += seats
        arr[last] -= seats
    }
    val result = IntArray(n)
    var acc =0
    for (i in 0 until n){
        acc += arr[i]
        result[i] = acc
    }
    return result
}
}