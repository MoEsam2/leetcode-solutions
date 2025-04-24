class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    nums.forEach { num ->
        map[num] = map.getOrDefault(num, 0) + 1
    }
    val maxValues = map.entries.sortedByDescending { it.value }.take(k)
    val result = maxValues.map { it.key }.toIntArray()
    return result
}
}