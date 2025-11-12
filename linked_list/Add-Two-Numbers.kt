/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
   fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    fun listToNumber(node: ListNode?): String {
        var current = node
        val sb = StringBuilder()
        while (current != null) {
            sb.insert(0, current!!.`val`)
            current = current!!.next
        }
        return sb.toString()
    }

    val num1 = listToNumber(l1).toBigInteger()
    val num2 = listToNumber(l2).toBigInteger()
    val sum = num1 + num2
    val reversedSum = sum.toString().reversed()
    val dummy = ListNode(0)
    var current = dummy
    for (c in reversedSum) {
        current.next = ListNode(c.digitToInt())
        current = current.next!!

    }
    return dummy.next
}
}