class Solution {
 fun missingMultiple(nums: IntArray, k: Int): Int {
        val hs = HashSet<Int>()
        nums.forEach {
            hs.add(it)
        }
        var current = k
        while(current in hs){
            current += k
        }
        return current
    }
}