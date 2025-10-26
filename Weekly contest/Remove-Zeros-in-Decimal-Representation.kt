class Solution {
   fun removeZeros(n: Long): Long {
    val s = n.toString()
    var result = ""
    for (c in s) {
        if ((c - '0') != 0) result += c
    }
    return result.toLong()

}
}