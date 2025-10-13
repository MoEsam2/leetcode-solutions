class Solution {
fun productExceptSelf(nums: IntArray): IntArray {
    var prefixProduct = IntArray(nums.size)
    var suffixProduct = IntArray(nums.size)
    var productExceptSelf = IntArray(nums.size)
    for (i in nums.indices) {
        if (i == 0) prefixProduct[i] = nums[i]
        else prefixProduct[i] = nums[i] * prefixProduct[i - 1]
    }
    for (i in nums.size - 1 downTo 0) {
        if (i == nums.size - 1) suffixProduct[i] = nums[i]
        else suffixProduct[i] = nums[i] * suffixProduct[i + 1]
    }
    for (i in nums.indices) {
        if (i == 0) productExceptSelf[i] = suffixProduct[i + 1]
        else if (i == nums.size - 1) productExceptSelf[i] = prefixProduct[i - 1]
        else productExceptSelf[i] = prefixProduct[i - 1] * suffixProduct[i + 1]
    }
    return productExceptSelf
}
}