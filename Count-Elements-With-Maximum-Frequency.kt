class Solution {
   fun maxFrequencyElements(nums: IntArray): Int {
    val table = HashMap<Int, Int>()
    for (num in nums) {
        table[num] = (table[num] ?: 0) + 1
    }
    val maxValue = table.maxOf { it.value }
    val count =  table.count { it.value == maxValue } 
    return maxValue * count
}
}