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
fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
    if (head == null || k == 1) return head

    val dummy = ListNode(0)
    dummy.next = head
    var tail = dummy

    var start = head
    var current = head
    var index = 1

    while (current != null) {
        while (current != null && index < k) {
            current = current.next
            index++
        }
        if (current == null) {
            tail.next = start
            break
        }
        val nextGroupStart = current.next
        
        var prev: ListNode? = null
        var currShift = start
        var nextShift = start?.next
        while (currShift != nextGroupStart) {
            currShift?.next = prev
            prev = currShift
            currShift = nextShift
            nextShift = nextShift?.next
        }
        tail.next = prev
        tail = start!!
        start = nextGroupStart
        current = nextGroupStart
        index = 1
    }
    return dummy.next
}
}