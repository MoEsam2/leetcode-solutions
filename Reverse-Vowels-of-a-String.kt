class Solution {
   fun reverseVowels(s: String): String {
    val vowels = "AEIOUaeiou"
    val chars = s.toCharArray()
    var right = s.length - 1
    var left = 0
    while (left < right) {
        while (left < right && chars[left] !in vowels) {
            left++
        }
        while (left < right && chars[right] !in vowels) {
            right--
        }
        val interValue = chars[left]
        chars[left] = chars[right]
        chars[right] = interValue
        left++
        right--
    }
    return String(chars)
}
}