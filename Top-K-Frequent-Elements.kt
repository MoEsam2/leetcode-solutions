class Solution {

fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    nums.forEach { num ->
        map[num] = map.getOrDefault(num, 0) + 1
    }
    val freq = Array<MutableList<Int>>(nums.size + 1) { mutableListOf() }
    map.forEach { k,v -> freq[v].add(k) }
    return freq.flatMap { it }.takeLast(k).toIntArray()
}

}