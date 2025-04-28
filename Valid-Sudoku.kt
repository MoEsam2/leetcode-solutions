class Solution {
   fun isValidSudoku(board: Array<CharArray>): Boolean {
    for (i in 0..8) {
        val rowMap = mutableMapOf<Char, Int>()
        val colMap = mutableMapOf<Char, Int>()
        val boxMap = mutableMapOf<Char, Int>()

        for (j in 0..8) {
            if (board[i][j] != '.') {
                if (rowMap.containsKey(board[i][j])) {
                    return false
                } else {
                    rowMap[board[i][j]] = 1
                }
            }

            if (board[j][i] != '.') {
                if (colMap.containsKey(board[j][i])) {
                    return false
                } else {
                    colMap[board[j][i]] = 1
                }
            }

            val rowIndex = 3 * (i / 3) + (j / 3)
            val colIndex = 3 * (i % 3) + (j % 3)

            if (board[rowIndex][colIndex] != '.') {
                if (boxMap.containsKey(board[rowIndex][colIndex])) {
                    return false
                } else {
                    boxMap[board[rowIndex][colIndex]] = 1
                }
            }
        }
    }
    return true
}
}