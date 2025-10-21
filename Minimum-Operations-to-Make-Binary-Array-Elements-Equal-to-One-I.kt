class Solution {
fun minOperations(nums: IntArray): Int {
    var counter = 0
    var size = nums.size
    for (i in 0 until nums.size - 2) {
        if (nums[i] == 0) {
            nums[i] = 1
            nums[i + 1] = nums[i + 1] xor 1
            nums[i + 2] = nums[i + 2] xor 1
            counter++
        }
    }

    return if (nums[size-2]==1 && nums[size-1] ==1) counter else -1
}
}