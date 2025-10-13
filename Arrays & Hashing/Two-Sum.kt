class Solution {
fun twoSum(numbers: IntArray, target: Int): IntArray {
    val diffMap = hashMapOf<Int, Int>()
    for (index in numbers.indices) {
        val diff = target - numbers[index]
        if (diffMap.containsKey(diff)) {
            return intArrayOf(diffMap[diff]!!, index)
        }
        else diffMap[numbers[index]] = index
    }
    return intArrayOf(0)
}
}