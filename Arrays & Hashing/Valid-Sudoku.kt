class Solution {
fun isValidSudoku(board: Array<CharArray>): Boolean {
    val seen = hashSetOf<String>()
    for (i in 0..8) {
        for (j in 0..8) {
            val currentValue = board[i][j]
            if (currentValue != '.') {
                if (!seen.add("$currentValue found in row $i") ||
                    !seen.add("$currentValue found in column $j") ||
                    !seen.add("$currentValue found in box ${i / 3}-${j / 3}")
                ) return false
            }
        }
    }
    return true
}
}