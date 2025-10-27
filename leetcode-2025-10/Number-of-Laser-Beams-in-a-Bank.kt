class Solution {
   fun numberOfBeams(bank: Array<String>): Int {
    var count = 0
    for (i in 0 until bank.size-1) {
        val current= bank[i].count { it == '1' }
        val next = bank[i+1].count { it == '1' }
        if (current == 0 &&i == 0) continue
        else if (current!=0 && next == 0) bank[i+1] = bank[i]
        else if(current!=0 && next != 0) count += current * next
    }
    return count
}
}