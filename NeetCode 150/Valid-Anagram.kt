class Solution {
fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val first = IntArray(26)
    val second = IntArray(26)
    for (c in s) first[c - 'a']++
    for (c in t) second[c - 'a']++
    for (c in s) {
        if (first[c - 'a'] - second[c - 'a'] != 0) return false
    }

    return true
}
}