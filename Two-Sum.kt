class Solution {
fun twoSum(numbers: IntArray, target: Int): IntArray {
    val table = HashMap<Int, Int>()
    numbers.forEachIndexed { index, num ->
        table[num]?.let { return intArrayOf(it, index) }
        table[target - num] = index
    }
    return intArrayOf(0)
}
}