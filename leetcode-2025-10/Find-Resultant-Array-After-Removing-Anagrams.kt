class Solution {
fun removeAnagrams(words: Array<String>): List<String> {
    val distinctList = mutableListOf<String>()
    for (i in 0 until words.size ) {
        if (i == 0 || words[i].toCharArray().sorted() != words[i - 1].toCharArray()
                .sorted()
        ) distinctList.add(words[i])
    }
    return distinctList
}
}