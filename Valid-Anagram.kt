class Solution {
 fun isAnagram(s: String, t: String): Boolean {
    val firstWord = s.toList().sorted()
    val secondWord = t.toList().sorted()
    return firstWord == secondWord
}
}