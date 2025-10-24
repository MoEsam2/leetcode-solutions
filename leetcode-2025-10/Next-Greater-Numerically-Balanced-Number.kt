class Solution {
fun nextBeautifulNumber(n: Int): Int {
    var num = n + 1
    while (true) {
        if (isNumericallyBalanced(num)) return num
        num++
    }
}

fun isNumericallyBalanced(num: Int): Boolean {
    val s = num.toString()
    var count = IntArray(10)
    for (c in s) count[c - '0']++
    for (c in s) {
        val d = c - '0'
        if (d == 0) return false
        if (count[d] != d) return false
    }
    return true
}
}