class Solution {
    fun getSneakyNumbers(nums: IntArray): IntArray {
    val seen = hashMapOf<Int,Int>()
    val result =IntArray(2)
    var count = 0
    for (i in nums.indices){
        val num =  nums[i]
        if (seen.containsKey(num)){
            result[count] = num
            count++
        }else seen[num] = i
    }
    return result
}
}