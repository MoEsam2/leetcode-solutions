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
fun reorderList(head: ListNode?): Unit {
    var slow = head
    var fast = head
    while (fast?.next?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }
    var prev: ListNode? = null
    var current = slow?.next
    slow?.next = null
    while (current != null) {
        val temp = current.next
        current.next = prev
        prev = current
        current = temp
    }

    var front = head
    var last = prev
    while (last != null){
        val firstTemp = front?.next
        val secondTemp = last.next
        front?.next = last
        last.next =  firstTemp
        front = firstTemp
        last = secondTemp
    }
}
}