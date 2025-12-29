1class Solution {
2fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
3    val arr = FlattenedMatrix(matrix)
4    var left = 0
5    var right = arr.size - 1
6    while (left <= right) {
7        val middle = left + (right - left) / 2
8        when {
9            arr[middle] == target -> return true
10            arr[middle] < target -> left = middle + 1
11            else -> right = middle - 1
12        }
13    }
14    return false
15
16}
17
18private fun FlattenedMatrix(matrix: Array<IntArray>): IntArray {
19    val rows = matrix.size
20    val cols = matrix[0].size
21    val array = IntArray(rows * cols)
22
23    var index = 0
24    for (i in 0 until rows) {
25        for (j in 0 until cols) {
26            array[index] = matrix[i][j]
27            index++
28        }
29    }
30    return array
31}
32}