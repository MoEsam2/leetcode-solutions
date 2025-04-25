class Solution {
   fun change(amount: Int, coins: IntArray): Int {
    val combination = IntArray(amount+1)
    combination[0]=1
    for (coin in coins){
        for (i in coin..amount){
            combination[i]+=combination[i-coin]
        }
    }
    return combination[amount]
}
}