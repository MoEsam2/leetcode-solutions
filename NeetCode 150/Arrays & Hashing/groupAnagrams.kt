class Solution {
fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val seenAnagrams = mutableMapOf<String, MutableList<String>>()
    for (str in strs) {
        val currentKey = str.toCharArray().sorted().toString()
        if (!seenAnagrams.containsKey(currentKey)) seenAnagrams[currentKey] = mutableListOf(str)
        else seenAnagrams[currentKey]?.add(str)
    }
    return seenAnagrams.values.toList()
}
 
}
