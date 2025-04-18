class Solution {
 fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val map = mutableMapOf<Int, Int>()
    for (index in nums.indices) {
        val key = nums[index]
        if (!map.containsKey(key)) {
            map[key] = index
        }else{
            if (abs(index - map[key]!!) <=k){
                return true
            }else{
                map[key] = index
            }
        }
    }
    return false
}
}