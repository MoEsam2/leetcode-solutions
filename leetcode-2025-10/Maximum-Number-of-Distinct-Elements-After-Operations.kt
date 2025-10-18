class Solution {
fun maxDistinctElements(nums: IntArray, k: Int): Int {
    nums.sort()
    var next = Int.MIN_VALUE
    var count = 0
    for (num in nums) {
        next = maxOf(next, num - k)
        if (next <= num + k) {
            count++
            next++
        }
    }
    return count
}
}