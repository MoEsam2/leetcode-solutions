class Solution {
 fun isAnagram(s: String, t: String): Boolean {
    val firstWord = mutableMapOf<Char, Int>()
    val secondWord = mutableMapOf<Char, Int>()
    for (index in s.indices) {
        var key = s[index]
        firstWord[key] = firstWord.getOrDefault(key, 0) + 1
    }
    for (index in t.indices) {
        var key = t[index]
        secondWord[key] = secondWord.getOrDefault(key, 0) + 1
    }
    return firstWord == secondWord
}
}