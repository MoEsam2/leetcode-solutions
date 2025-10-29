class Solution {
     inline fun smallestNumber(n: Int): Int = (n.takeHighestOneBit() shl 1) - 1

}