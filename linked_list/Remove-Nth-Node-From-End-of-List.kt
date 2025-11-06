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
   fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    var current = head
    var size = 0
    while (current != null) {
        size++
        current = current.next
    }
    val dummy = ListNode(0).apply { next = head }
    var prev = dummy
    current = head
    var counter = 0
    while (current != null) {
        var indexFromEnd = size - counter
        if (indexFromEnd == n) {
            prev.next = current.next
        } else {
            prev = current
        }
        counter++
        current = current.next
    }
    return dummy.next
}
}