class Solution {
   fun containsDuplicate(nums: IntArray): Boolean {
    val maxNumber = nums.maxOrNull() ?: 0
    val map = mutableMapOf<Int, Int>()
    for (index in nums.indices) {
        val diff = maxNumber - nums[index]
        if (map.containsKey(diff)) {
            return true
        }
        map[diff] = index
    }
    return false
}
}