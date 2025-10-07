class Solution {
fun isHappy(n: Int): Boolean {
    fun next(m: Int): Int {
        var sum = 0
        var num = m
        while (num > 0) {
            val digit = num % 10
            sum += (digit * digit)
            num /= 10
        }
        return sum
    }

    var slow = n
    var fast = next(n)
    while (fast != 1 && slow != fast) {
        slow = next(slow)
        fast = next(next(fast))
    }
    return fast == 1
}
}