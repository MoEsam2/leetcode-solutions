class Solution {
fun lengthOfLongestSubstring(s: String): Int {
     val seen = mutableMapOf<Char, Int>()
    var left = 0
    var maxLength = 0
    for ((right, c) in s.withIndex()) {
        if (seen.containsKey(c) && seen[c]!! >= left) {
            left = seen[c]!! + 1
        }
        seen[c] = right
        maxLength = max(maxLength, right - left + 1)
    }
    return maxLength

}
}