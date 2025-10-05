class Solution {
fun strStr(haystack: String, needle: String): Int {
    val needleLen = needle.length
    if (needleLen > haystack.length) return -1
    var left = 0
    var right = 0
    while (right != haystack.length ) {
        right = left + needleLen
        if (haystack.substring(left, right) == needle) {
            return left
        }
        left++
    }
    return -1
}
}