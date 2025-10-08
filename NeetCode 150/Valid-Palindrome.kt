class Solution {
fun isPalindrome(s: String): Boolean {
    var left = 0
    var right = s.length - 1
    while (left < right) {
        while (!s[left].isLetterOrDigit() && left != right) left++
        while (!s[right].isLetterOrDigit() && right != left) right--
        val leftChar = s[left].lowercaseChar()
        val rightChar = s[right].lowercaseChar()
        if (leftChar != rightChar) return false
        left++
        right--
    }
    return true
}
}