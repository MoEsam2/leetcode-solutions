class Solution {
fun waysToSplitArray(nums: IntArray): Int {
    var leftSum = 0L
    var rightSum = 0L
    var count = 0
    for (num in nums) {
        rightSum += num
    }
    for (i in 0 until nums.size - 1) {
        leftSum += nums[i]
        rightSum -= nums[i]
        if (leftSum >= rightSum) count++
    }
    return count
}
}