class Solution {
   fun containsDuplicate(nums: IntArray): Boolean {
    val seen = mutableSetOf<Int>()
    for (num in nums) {
        if (num in seen) {
            return true
        }
        seen.add(num)
    }
    return false
}
}