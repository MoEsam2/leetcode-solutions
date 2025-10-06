class Solution {
fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    val result = IntArray(nums1.size)
    for (i in nums1.indices) {
        result[i] = nums1[i]
    }
    var right = 0
    var left = 0
    for (i in nums1.indices) {
        if (right == n || (result[left] <= nums2[right] && !(left >= m))) {
            nums1[i] = result[left]
            left++
        } else {
            nums1[i] = nums2[right]
            right++
        }
    }
}
}