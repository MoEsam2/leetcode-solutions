class Solution {
   fun findMissingElements(nums: IntArray): List<Int> {
    nums.sort()
    val set = nums.toSet()
    var cuurent = nums[0]
    var list = mutableListOf<Int>()
    while (cuurent != nums[nums.size - 1]) {
        cuurent++
        if (cuurent !in nums) {
            list.add(cuurent)
        }
    }
    return list
}
}