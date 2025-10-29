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
    
fun reverseList(head: ListNode?): ListNode? {
    var prev: ListNode? = null
    var current = head
    var next: ListNode? = null
    while (current != null) {
        next = current.next
        current.next = prev
        prev = current
        current = next
    }
    return prev
}
}