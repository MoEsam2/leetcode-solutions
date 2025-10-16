class Solution {
fun threeSum(nums: IntArray): List<List<Int>> {
    val list = nums.sorted()
    val result = mutableSetOf<List<Int>>()
    var middlePointer: Int
    var rightPointer: Int
    var target: Int
    for (leftPointer in 0 until list.size - 1) {
        target = -list[leftPointer]
        middlePointer = leftPointer + 1
        rightPointer = list.size - 1
        while (middlePointer < rightPointer) {
            val sum = list[middlePointer] + list[rightPointer]
            when {
                sum == target -> {
                    result.add(listOf(list[leftPointer], list[middlePointer], list[rightPointer]))
                    middlePointer++
                    rightPointer--
                }
                sum < target -> middlePointer++
                else -> rightPointer--
            }
        }

    }
    return result.toList()
}
}