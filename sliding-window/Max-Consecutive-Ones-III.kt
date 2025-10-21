class Solution {
fun longestOnes(nums: IntArray, k: Int): Int {
    var start = 0
    var counter = 0
    var max = 0
    for ((end, num) in nums.withIndex()) {
        if (nums[end] == 0) counter++
        if (counter > k) {
            if (nums[start] == 0) counter--
            start++
        } else {
            max = if (max > end - start + 1) max else end - start + 1
        }
    }
    return max
}
}