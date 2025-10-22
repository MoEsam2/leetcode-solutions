class Solution {
    fun longestBalanced(nums: IntArray): Int {
        var res = 0
        for (i in nums.indices) {
            val even = HashSet<Int>()
            val odd = HashSet<Int>()
            var size = 0
            for (j in i until nums.size) {
                size++
                if (nums[j] % 2 == 0)
                    even.add(nums[j])
                else
                    odd.add(nums[j])

                if (even.size == odd.size)
                    res = maxOf(res, size)
            }
        }
        return res
    }
}