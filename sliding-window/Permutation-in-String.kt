class Solution {
fun checkInclusion(s1: String, s2: String): Boolean {
    if (s1.length > s2.length) return false
    val strArray = IntArray(26)
    val str2window = IntArray(26)
    for (i in s1.indices) {
        strArray[s1[i] - 'a']++
        str2window[s2[i] - 'a']++
    }
    for (i in 0 until s2.length - s1.length) {
        if (strArray.contentEquals(str2window)) return true
        //if not the sliding window removes element from left and adds one right
        str2window[s2[i] - 'a']--
        str2window[s2[i + s1.length] - 'a']++
    }
    return strArray.contentEquals(str2window)
}
}