class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
       val seen = HashSet<String>()
       
       for(i in 0 until 9){
           for(j in 0 until 9){
               var number = board[i][j]
               if(number != '.'){
                   if(!seen.add("$number in row $i") ||
                      !seen.add("$number in column $j") ||
                      !seen.add("$number in block ${i/3}-${j/3}")) return false
                   
               }
           }
       }
       
       return true
    
    }
}