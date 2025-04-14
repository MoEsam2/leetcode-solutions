class Solution {
fun mergeAlternately(word1: String, word2: String): String {
    val wordOneLength = word1.length
    val wordTwoLength = word2.length
    val result = StringBuilder()
    var left = 0
    var right = 0
    while (left < wordOneLength || right < wordTwoLength) {
        if (left < wordOneLength) {
            result.append(word1[left])
            left++
        }
        if (right < wordTwoLength) {
            result.append(word2[right])
            right++
        }
    }
    return result.toString()

}
}