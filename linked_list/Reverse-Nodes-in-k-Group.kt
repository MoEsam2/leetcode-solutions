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
    val dummy = ListNode(0)
    var tail = dummy
    var current = head
    var index = 1
    var next: ListNode? = null
    var start = head
    while (current != null) {
        while (current != null && index != k) {
            current = current.next
            if (current == null) break
            index++
        }
        if (index != k){
         tail.next = start
         break
        }
        next = current?.next
        var prev: ListNode? = null
        var currentShift = start
        var nextShift = start?.next
        while (currentShift != next) {
            currentShift?.next = prev
            prev = currentShift
            currentShift = nextShift
            nextShift = nextShift?.next
        }
        tail.next = prev
        tail = start!!
        start = next
        current = next
        index = 1
    }
    return dummy.next
}
}