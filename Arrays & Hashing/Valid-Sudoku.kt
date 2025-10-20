class Solution {
fun isValidSudoku(board: Array<CharArray>): Boolean {
    for (i in 0..8) {
        val rowMap = hashMapOf<Char, Int>()
        val columMap = hashMapOf<Char, Int>()
        val boxMap = hashMapOf<Char, Int>()
        for (j in 0..8) {
            if (board[i][j] != '.') {
                if (rowMap.containsKey(board[i][j])) {
                    println("hi")
                    return false
                }
                else rowMap[board[i][j]] = 1
            }
            if (board[j][i] != '.') {
                if (columMap.containsKey(board[j][i])) return false
                else columMap[board[j][i]] = 1
            }
            val rowIndex = 3 * (i / 3) + (j / 3)
            val columIndex = 3 * (i % 3) + (j % 3)
            if (board[rowIndex][columIndex] != '.') {
                if (boxMap.containsKey(board[rowIndex][columIndex])) return false
                else boxMap[board[rowIndex][columIndex]] = 1
            }
        }
    }
    return true
}
}