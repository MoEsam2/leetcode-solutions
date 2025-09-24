class Solution {
  fun maxFrequencyElements(nums: IntArray): Int {
    val table = HashMap<Int, Int>()
    nums.forEach { num ->
        table[num] = (table[num] ?: 0) + 1
    }
    val max = table.maxOf { it.value }
    val numOfMax = table.count { it.value == max }
    return max * numOfMax
}
}