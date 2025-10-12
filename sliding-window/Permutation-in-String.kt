class Solution {
fun checkInclusion(s1: String, s2: String): Boolean {
    if (s1.length > s2.length) return false
    val count = IntArray(26)
    for (char in s1) count[char - 'a']++
    for ((index, char) in s2.withIndex()) {
        count[char - 'a']--
        if (index >= s1.length) {
            count[s2[index - s1.length] - 'a']++
        }
        if (count.all { it <= 0 }) return true
    }
    return false
}
}