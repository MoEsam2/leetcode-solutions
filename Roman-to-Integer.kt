class Solution {
 fun romanToInt(s: String): Int {
    var result = 0
    val size = s.length
    val numeralsTable = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    s.forEachIndexed { index, c ->
        val value = numeralsTable.getOrDefault(c,0)
        val nextValue = numeralsTable.getOrDefault(s.getOrNull(index + 1), 0)
        if (value < nextValue) {
            result += (-value)
        } else {
            result += value
        }
    }
    return result
}
}