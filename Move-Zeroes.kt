class Solution {
 fun moveZeroes(nums: IntArray): Unit {
    var pointerToZero = 0
    for (i in nums.indices) {
        if (nums[i] != 0) {
            val temp = nums[i]
            nums[i] = nums[pointerToZero]
            nums[pointerToZero] = temp
            pointerToZero++
        }
    }
}

}