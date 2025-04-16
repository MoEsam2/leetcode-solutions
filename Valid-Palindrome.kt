class Solution {
   fun isPalindrome(s: String): Boolean {
    val cleanedString = s.lowercase().replace(Regex("[^a-z0-9]"), "")
    println(cleanedString)
    var right = cleanedString.length-1
    var left = 0
    while (left < right) {
        if (cleanedString[left] != cleanedString[right]) {
            return false
        }
        left++
        right--
    }
    return true
}
}