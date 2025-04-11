class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        val result = mutableListOf<Boolean>()
        val maxCandies = candies.maxOrNull() ?: 0
        for (index in 0 until candies.size) {
            val afterExtraCandies = candies[index] + extraCandies
            val isTrue = afterExtraCandies >= maxCandies
            result.add(isTrue)
        }
        return result
    }
}