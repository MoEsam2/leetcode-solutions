class Solution {
fun checkInclusion(s1: String, s2: String): Boolean {
    val sortedString = s1.toCharArray().sorted()
    println(sortedString)
    for (i in 0 .. s2.length-s1.length) {
        if (s2.substring(i, i + s1.length).toCharArray().sorted() == sortedString) return true
    }
    return false
}
}