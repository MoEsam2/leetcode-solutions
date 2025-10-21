class Solution {
    fun longestOnes(nums: IntArray, k: Int): Int {
    val seen = hashMapOf<Int, Int>()
    var start = 0
    var max = 0
    for ((end, num) in nums.withIndex()) {
        seen[num] = seen.getOrDefault(num, 0) + 1
        if (seen.getOrDefault(0, 0) > k) {
            seen[nums[start]] = seen.getOrDefault(nums[start], 0) - 1
            start++
        } else {
            max = if (max > end - start + 1) max else end - start + 1
        }
    }
    return max
}
}