class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in 0 until nums.size) {
            for (j in i + 1 until nums.size) {
                val sum = nums[i] + nums[j]
                if (sum == target) return intArrayOf(i, j)
            }
        }
        return return intArrayOf()
    }
}