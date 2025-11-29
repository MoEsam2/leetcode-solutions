1class Solution {
2 fun minOperations(nums: IntArray, k: Int): Int {
3    var sum = 0
4    for (num in nums) {
5        sum += num
6    }
7    return sum % k
8}
9}