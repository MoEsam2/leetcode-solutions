class Solution {
fun maxArea(height: IntArray): Int {
    var right = height.size - 1
    var left = 0
    var maxHeight = 0
    while (left < right) {
        val width = right - left
        val minValue = if (height[left] < height[right]) height[left] else height[right]
        if (height[left] < height[right]) left++ else right--
        maxHeight = max(maxHeight, minValue * width)
    }
    return maxHeight
}
}