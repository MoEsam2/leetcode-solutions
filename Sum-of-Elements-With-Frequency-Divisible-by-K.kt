class Solution {
    fun sumDivisibleByK(nums: IntArray, k: Int): Int {
    val seen = hashMapOf<Int, Int>()
    var sum = 0
    for (i in nums.indices) {
        seen[nums[i]] = seen.getOrDefault(nums[i], 0) + 1
    }
    seen.forEach {
        if (it.value  % k == 0) sum+= (it.value * it.key)
    }
    return sum
}
}