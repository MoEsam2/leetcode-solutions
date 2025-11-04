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
    fun hasCycle(head: ListNode?): Boolean {
    val seen = mutableSetOf<ListNode>()
    var current = head
    while (current != null){
        if(current in seen) return true
        seen.add(current)
        current = current.next
    }
    return false
}
}