class Solution {
fun isPalindrome(s: String): Boolean {
    fun toLower(c: Char): Char {
        return if (c in 'A'..'Z') (c + 32) else c
    }

    fun isAlphaNum(c: Char): Boolean {
        return (c in 'a'..'z') || (c in 'A'..'Z') || (c in '0'..'9')
    }

    var left = 0
    var right = s.length - 1
    while (left < right) {
        while (!isAlphaNum(s[left]) && left != right) left++
        while (!isAlphaNum(s[right]) && right != left) right--
        if (toLower(s[left]) != toLower(s[right])) return false
        left++
        right--
    }
    return true
}
}