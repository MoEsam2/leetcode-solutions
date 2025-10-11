class Solution {
fun maximumEnergy(energy: IntArray, k: Int): Int {
    val prefixEnergy = IntArray(energy.size + 1)
    var max = Int.MIN_VALUE
    for (i in energy.size - 1 downTo 0) {
        prefixEnergy[i] = energy[i]
        if (i + k < energy.size) prefixEnergy[i] += prefixEnergy[i + k]
        max = if (max > prefixEnergy[i]) max else prefixEnergy[i]
    }

    return max
}
}