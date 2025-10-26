class Solution {
 fun maxAlternatingSum(nums: IntArray): Long {
    if (nums.isEmpty()) return 0
    if (nums.size == 1) return (abs(nums[0]).toLong() * abs(nums[0]))
    val arr = nums.map { abs(it) }.sorted()
    var left = 0
    var right = arr.size - 1
    var result = 0L
    while (left < right) {
        val big = arr[right].toLong()
        val small = arr[left].toLong()
        result += (big * big) - (small * small)
        left++
        right--
    }
    if (left == right) {
        val mid = arr[left].toLong()
        result += mid * mid
    }
    return result
}
}