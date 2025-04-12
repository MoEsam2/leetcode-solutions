class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val sub = target - nums[i]
            if (map.containsKey(sub)) {
                return intArrayOf(map[sub]!!, i)
            }
            map[nums[i]] = i
        }
        return return intArrayOf()
    }
}