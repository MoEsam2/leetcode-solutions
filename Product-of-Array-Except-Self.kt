class Solution {
fun productExceptSelf(nums: IntArray): IntArray {
    val prefix = MutableList(nums.size) { 0 }
    val zeroIndex = nums.indexOf(0)
    val zeroCount = nums.count { it == 0 }
    if (zeroCount == 1) {
        val zeroReplacement = nums.fold(1) { acc, i ->
            if (i == 0) acc else acc * i
        }
        prefix[zeroIndex] = zeroReplacement
    } else if(zeroCount ==0) {
        prefix[0] = nums[0]
        for (i in 1 until nums.size) {
            prefix[i] = prefix[i - 1] * nums[i]
        }
        for (i in 0 until nums.size) {
            if(nums[i] == 0) prefix[i] =0
            prefix[i] = prefix[nums.size-1]/nums[i]
        }
    }
   
    return prefix.toIntArray()
}
}