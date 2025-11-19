class Solution {
fun findFinalValue(nums: IntArray, original: Int): Int {
   val seen = hashSetOf<Int>()
    for (num in nums) seen.add(num)
    var num = original
    while (true) {
        if (num in seen) num *= 2
        else break
    }
    return num
}
}