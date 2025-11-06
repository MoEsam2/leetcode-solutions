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
    var fast = head
    var slow = head
    repeat(n){
        fast = fast?.next
    }
    if(fast == null) return head?.next
    while (fast?.next != null){
        fast = fast?.next
        slow = slow?.next
    }
    slow?.next = slow?.next?.next
    return head
}
}