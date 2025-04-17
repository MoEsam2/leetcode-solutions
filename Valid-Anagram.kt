class Solution {
 fun isAnagram(s: String, t: String): Boolean {
    val firstWord = mutableMapOf<Char, Int>()
    val secondWord = mutableMapOf<Char, Int>()
    for (index in s.indices) {
        var key = s[index]
        if (!firstWord.containsKey(key)) {
            firstWord[key] = 0
        } else {
            firstWord[key] = firstWord[key]!! + 1
        }
    }
    for (index in t.indices) {
        var key = t[index]
        if (!secondWord.containsKey(key)) {
            secondWord[key] = 0
        } else {
            secondWord[key] = secondWord[key]!! + 1
        }
    }
    return firstWord == secondWord
}
}