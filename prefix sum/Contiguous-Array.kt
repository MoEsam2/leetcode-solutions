class Solution {
  
fun findMaxLength(nums: IntArray): Int {
    val seen = hashMapOf<Int, Int>()
    var sum = 0
    var result = 0
    seen[0] = -1
    for (i in nums.indices) {
        val num = nums[i]
        if (num == 1) sum += 1 else sum -= 1
        if(seen.containsKey(sum)){
            val distance = i - seen[sum]!!
            result =  if(result > distance) result else distance
        }else{
            seen[sum] = i
        }
    }

    return result
}
}