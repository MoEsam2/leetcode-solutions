class Solution {
fun pivotIndex(nums: IntArray): Int {
    val prefixSum = IntArray(nums.size)
    val suffixSum = IntArray(nums.size)
    for (i in nums.indices) {
        if (i == 0) {
            prefixSum[i] = nums[i]
            continue
        }
        prefixSum[i] = prefixSum[i - 1] + nums[i]
    }
    for (i in nums.size - 1 downTo 0) {
        if (i == nums.size - 1) {
            suffixSum[i] = nums[i]
            continue
        }
        suffixSum[i] = nums[i] + suffixSum[i + 1]
    }
    for (i in nums.indices) {
        val left = if (i > 0) prefixSum[i - 1] else 0
        val right = if (i < nums.size - 1) suffixSum[i + 1] else 0

        if (left == right) return i
    }
    return -1
}
}