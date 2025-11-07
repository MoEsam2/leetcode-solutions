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
    val stack = Stack<ListNode>()
    var size = 0
    var pointer = head
    while (pointer != null) {
        size++
        stack.push(pointer)
        pointer = pointer.next
    }
    var current = head
    var next = head?.next
    for (i in 0 until size / 2) {
        val lastValue = stack.pop()
        current?.next = lastValue
        lastValue.next = next
        current = next
        next = next?.next
    }
    current?.next = null
}
}