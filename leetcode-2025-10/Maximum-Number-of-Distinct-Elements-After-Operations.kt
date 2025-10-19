class Solution {
fun maxDistinctElements(nums: IntArray, k: Int): Int {
    nums.sort()
    var curr = nums[0] - k
    var count = 1
    curr++
    for (i in 1 until nums.size) {
        curr = if (curr > nums[i] - k) curr else nums[i] - k
        if (curr <= k + nums[i]) {
            count++
            curr++
        }
    }
    return count
}

}