class Solution {
   fun isSubsequence(s: String, t: String): Boolean {
    var index = 0
    for (ch in t) {
        if (index < s.length && ch == s[index]) {
            index++
        }
    }
    return index == s.length
}
}