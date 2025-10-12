class Solution {
fun checkInclusion(s1: String, s2: String): Boolean {
    val strArray = IntArray(26)
    s1.forEach {
        strArray[it - 'a'] += 1
    }
    for (i in 0..s2.length - s1.length) {
        val str2Array = IntArray(26)
        s2.substring(i, i + s1.length).forEach {
            str2Array[it - 'a'] += 1
        }
        if (str2Array.joinToString() == strArray.joinToString()) return true
    }
    return false
}
}