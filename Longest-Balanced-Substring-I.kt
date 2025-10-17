class Solution {
  fun longestBalanced(s: String): Int {
    var result = 0
    for (start in s.indices) {
        val freq = IntArray(26)
        for (end in start until s.length) {
            freq[s[end] - 'a']++
            var min = Int.MAX_VALUE
            var max = 0
            for (count in freq) {
                if (count > 0) {
                    if (count < min) min = count
                    if (count > max) max = count
                }
            }
            if (min == max) result = if (result > end - start + 1) result else end - start + 1
        }
    }
    return result
}
}