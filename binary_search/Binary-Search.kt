class Solution {
    fun search(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1
    while (left <= right) {
        val middle = left + (right - left) / 2
        val value = nums[middle]
        when {
            value == target -> return middle
            target < value -> right = middle - 1
            else -> left = middle + 1
        }
    }
    return -1
}
}