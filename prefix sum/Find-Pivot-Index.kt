class Solution {
fun pivotIndex(nums: IntArray): Int {
  val prefixSum = IntArray(nums.size)
    val suffixSum = IntArray(nums.size)
    var sum = 0
    for (i in nums.indices) {
        sum += nums[i]
        prefixSum[i] = sum
    }
    sum = 0
    for (i in nums.size - 1 downTo 0) {
        sum += nums[i]
        suffixSum[i] = sum
    }
    for (i in nums.indices) {
        val left = if (i > 0) prefixSum[i - 1] else 0
        val right = if (i < nums.size - 1) suffixSum[i + 1] else 0

        if (left == right) return i
    }
    return -1
}
}