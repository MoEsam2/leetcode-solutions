class Solution {
fun waysToSplitArray(nums: IntArray): Int {
    val n = nums.size
    val prefixSum = LongArray(n)
    val suffixSum = LongArray(n)
    var sum = 0L
    var count = 0
    for (i in 0 until n) {
        sum += nums[i]
        prefixSum[i] = sum
    }
    sum = 0L
    for (i in n - 1 downTo 0) {
        sum += nums[i]
        suffixSum[i] = sum
    }
    for (i in 0 until n - 1) {
        val left = prefixSum[i]
        val right = suffixSum[i + 1]
        if (left >= right) count++
    }
    return count
}
}