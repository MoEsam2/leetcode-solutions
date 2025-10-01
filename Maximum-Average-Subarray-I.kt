class Solution {
    fun findMaxAverage(nums: IntArray, k: Int): Double {
    var sum = ((nums.take(k).sum()))
    var maxSum = sum
    for (i in k until nums.size) {
        sum += (nums[i] - nums[i - k])
        maxSum = max(maxSum, sum)
    }
    return maxSum / k.toDouble()
}
}