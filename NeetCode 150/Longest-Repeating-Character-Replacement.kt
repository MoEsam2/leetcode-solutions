class Solution {
fun characterReplacement(s: String, k: Int): Int {
    val seen = hashMapOf<Char, Int>()
    var start = 0
    var max = 0
    var maxFreq = 0
    for ((end, c) in s.withIndex()) {
        seen[c] = seen.getOrDefault(c, 0) + 1
        maxFreq = if (maxFreq > seen[c]!!) maxFreq else seen[c]!!
        if ((end - start + 1) - k > maxFreq) {
            seen[s[start]] = seen.getOrDefault(s[start], 0) - 1
            start++
        }
        max = if (max > end - start + 1) max else end - start + 1
    }
    return max
}
}