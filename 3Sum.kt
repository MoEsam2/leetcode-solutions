class Solution {
fun threeSum(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    val sortedNums = nums.sorted()
    for (i in 0 until sortedNums.size - 2) {
        if (i > 0 && sortedNums[i] == sortedNums[i - 1]) continue
        var left = i + 1
        var right = sortedNums.size - 1
        while (left < right) {
            val sum = sortedNums[i] + sortedNums[left] + sortedNums[right]
            when {
                sum == 0 -> {
                    result.add(listOf(sortedNums[i], sortedNums[left], sortedNums[right]))
                    while (left < right && sortedNums[left] == sortedNums[left + 1]) left++
                    while (left < right && sortedNums[right] == sortedNums[right - 1]) right--

                    left++
                    right--
                }
                sum < 0 -> left++
                else -> right--
            }
        }
    }

    return result
}
}