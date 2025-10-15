class Solution {
fun maxIncreasingSubarrays(nums: List<Int>): Int {
    var currentSubArray = 1
    var prevSubArray = 0
    var k = 0
    for (i in 1 until nums.size) {
        if (nums[i] > nums[i - 1]) currentSubArray++
        else {
            prevSubArray = currentSubArray
            currentSubArray = 1
        }
        k = max(k, if (currentSubArray > prevSubArray) prevSubArray else currentSubArray)
        k = max(k, currentSubArray / 2)

    }
    return k
}
}