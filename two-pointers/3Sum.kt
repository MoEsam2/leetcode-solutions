class Solution {
fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    nums.sort()
    for (leftPointer in 0 until nums.size - 1) {
        if (nums[leftPointer] > 0) break
        if (leftPointer > 0 && nums[leftPointer] == nums[leftPointer - 1]) continue
        var middlePointer = leftPointer + 1
        var rightPointer = nums.size - 1
        while (middlePointer < rightPointer) {
            val sum = nums[leftPointer] + nums[middlePointer] + nums[rightPointer]
            when {
                sum == 0 -> {
                    result.add(listOf(nums[leftPointer], nums[middlePointer], nums[rightPointer]))
                    middlePointer++
                    rightPointer--
                    while (middlePointer < rightPointer && nums[middlePointer] == nums[middlePointer - 1]) middlePointer++
                }

                sum < 0 -> middlePointer++
                else -> rightPointer--
            }
        }
    }
    return result
}
}