class Solution {
    fun findDuplicate(nums: IntArray): Int {
    val arr = IntArray(nums.size)
    for (num in nums){
        arr[num]++
    }
    for (i in 1 until arr.size){
        if(arr[i] >1) return i
    }
    return 0
}
}