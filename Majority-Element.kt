class Solution {
   fun majorityElement(nums: IntArray): Int {
    val table = HashMap<Int, Int>()
    val tableSize = nums.size
    var result = 0
    for (index in nums.indices) {
        var num = nums[index]
        table[num] = table.getOrDefault(num, 0) + 1
    }
    table.forEach { (key, value) ->
        if (value > (tableSize / 2)) result = key
    }

    return result
}
}