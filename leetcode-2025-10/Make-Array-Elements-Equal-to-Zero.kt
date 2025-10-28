class Solution {
fun countValidSelections(nums: IntArray): Int {
    var count = 0
    var sum = 0
    val prefixSum = IntArray(nums.size)
    for (i in nums.indices) {
        sum += nums[i]
        prefixSum[i] = sum
    }
    for (i in nums.indices) {
        val left = if (i == 0) 0 else prefixSum[i - 1]
        val right = if (i == nums.size - 1) 0 else prefixSum[nums.size - 1] - prefixSum[i]
        if (nums[i] == 0 && left == right) {
            count += 2
        }
        if (nums[i] == 0 && (left + 1 == right || left == right + 1)) {
            count += 1
        }
    }
    return count
}
}