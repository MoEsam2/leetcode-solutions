class Solution {
   fun isPalindrome(s: String): Boolean {
    var right = s.length-1
    var left = 0
    while (left < right) {
       if (left < right && !s[left].isLetterOrDigit()){
           left++
           continue
       }
        if (left < right && !s[right].isLetterOrDigit()){
            right--
            continue
        }
        if (s[left].lowercase() != s[right].lowercase()){
            return false
        }
        right--
        left++

    }
    return true
}

}