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
    var firstPointer = l1
    var secondPointer = l2
    var carry = 0
    val dummy = ListNode(0)
    var current = dummy
    while (firstPointer != null || secondPointer != null) {
        val x = firstPointer?.`val` ?: 0
        val y = secondPointer?.`val` ?: 0
        val sum = x + y + carry
        carry = sum / 10
        current.next = ListNode(sum % 10)
        current = current.next!!
        firstPointer = firstPointer?.next
        secondPointer = secondPointer?.next
    }
    if (carry > 0) {
        current.next = ListNode(carry)
    }
    return dummy.next
}
}