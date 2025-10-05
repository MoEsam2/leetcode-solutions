class Solution {
   fun maxArea(height: IntArray): Int {
    var right = height.size - 1
    var left = 0
    var maxHeight = 0
    while (left < right) {
        var minValue: Int
        val width = right - left
        if (height[left] < height[right]) {
            minValue = height[left]
            left++
        } else {
            minValue = height[right]
            right--
        }
        maxHeight = max(maxHeight, minValue * width)
    }
    return maxHeight
}
}