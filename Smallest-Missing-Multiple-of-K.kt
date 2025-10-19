class Solution {
fun missingMultiple(nums: IntArray, k: Int): Int {
    var counter = k
    while (counter <= 10000) {
        if (counter % k == 0 && counter !in nums) return counter
        else counter++
    }
    return 0
}
}