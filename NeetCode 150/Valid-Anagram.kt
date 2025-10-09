class Solution {
fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false
    val seen = hashMapOf<Char, Int>()
    s.forEach {
        seen[it] = seen.getOrDefault(it, 0) + 1
    }
    t.forEach {
        val newSeen = seen.getOrDefault(it,0) - 1
        if (newSeen < 0) return false
        seen[it] = newSeen
    }
    return true
}
}