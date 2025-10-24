class Solution {
    fun largestAltitude(gain: IntArray): Int {
    var sum = 0
    var result = sum
    val prefixSum = IntArray(gain.size + 1)
    for (i in gain.indices){
        sum+= gain[i]
        prefixSum[i+1] = sum
        result = if(result > sum) result else sum
    }
    return result
}
}