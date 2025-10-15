class Solution {
fun longestConsecutive(nums: IntArray): Int {
    val hashSet = hashSetOf<Int>()
    if (nums.isEmpty()) return 0
    nums.forEach { hashSet.add(it) }
    var maxCounter = 0
    for (num in nums) {
        if (!hashSet.contains(num - 1)) {
            var current = num
            var counter = 1
            while (hashSet.contains(current + 1)) {
                counter++
                current++
            }
            if (counter > maxCounter) maxCounter = counter
        }
    }
    return maxCounter
}
}