class Solution {
fun numberOfBeams(bank: Array<String>): Int {
    var count = 0
    var prev = 0

    for (row in bank) {
        val current = row.count { it == '1' }
        if (current == 0) continue
        count += prev * current
        prev = current
    }

    return count
}

}