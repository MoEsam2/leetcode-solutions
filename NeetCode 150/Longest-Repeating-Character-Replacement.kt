class Solution {
   fun characterReplacement(s: String, k: Int): Int {
    val seen = hashMapOf<Char, Int>()
    var start = 0
    var maxFreq = 0
    var max = 0
    for (end in 0 until s.length) {
        val currentChar = s[end]
        seen[currentChar] = seen.getOrDefault(currentChar, 0) + 1
        maxFreq = if (maxFreq > seen[currentChar]!!) maxFreq else seen[currentChar]!!
        if ((end - start + 1 )- k > maxFreq) {
            seen[s[start]] = seen.getOrDefault(s[start], 0) - 1
            start++
        }
        max = if (max > end - start + 1) max else end - start + 1
        println(max)
    }

    return max
}
}