class Solution {
   fun moveZeroes(nums: IntArray): Unit {
    var left = 0
    var right = 1
    if (nums.size == 1) {
        println(nums)
        return
    }
    while (right != nums.size) {
        if (nums[left] == 0 && nums[right] != 0) {
            val temp = nums[left]
            nums[left] = nums[right]
            nums[right] = temp
            left++
            right++
        } else if (nums[left] == 0 && nums[right] == 0) {
            right++
        } else {
            left++
            right++
        }
    }
}
}