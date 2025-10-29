class Solution {
    fun calculatePower(base: Int, exponent: Int): Int {
    var result = 1
    var exp = exponent
    while (exp != 0) {
        result *= base
        exp--
    }
    return result
}
   fun smallestNumber(n: Int): Int {
        for (i in 0..10){
            val result = calculatePower(2,i)-1
            if(n <= result ){
                return result
            }
        }
    return 0
}
}