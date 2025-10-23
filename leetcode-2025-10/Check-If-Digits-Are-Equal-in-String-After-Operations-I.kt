class Solution {
 fun hasSameDigits(s: String): Boolean {
    val digits = IntArray(s.length) { s[it] - '0' }
    var len = digits.size
    while (len > 2) {
        for (i in 0 until len - 1) {
            digits[i] = (digits[i] + digits[i + 1]) % 10
        }
        len--
    }
    return digits[0] == digits[1]
}
}