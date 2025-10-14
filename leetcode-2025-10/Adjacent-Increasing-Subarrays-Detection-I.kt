class Solution {
fun hasIncreasingSubarrays(nums: List<Int>, k: Int): Boolean {
    if (k == 1) return nums.size >= 2
    var count = 1
    val list = mutableListOf<Int>()
    for (i in nums.indices) {
        if (i == 0) continue
        if (nums[i] > nums[i - 1]) {
            count++
        } else {
            count = 1
        }
        if (count >= k) {
            list.add(i - k + 1)
        }
    }
    for (num in list) {
        if (list.contains(num + k)) return true
    }

    return false
}
}