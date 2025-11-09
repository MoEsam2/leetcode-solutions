/**
 * Example:
 * var ti = Node(5)
 * var v = ti.`val`
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var next: Node? = null
 *     var random: Node? = null
 * }
 */

class Solution {
    fun copyRandomList(node: Node?): Node? {
    if (node == null) return null
    var current = node
    while (current != null) {
        var copy = Node(current.`val`)
        copy.next = current.next
        current.next = copy
        current = copy.next
    }
    current = node
    while (current != null) {
        current.next?.random = current.random?.next
        current = current.next?.next
    }
    current = node
    val dummy = Node(0)
    var tail = dummy
    while (current != null) {
        tail.next = current.next
        tail = tail.next!!
        current.next = current.next?.next
        current = current.next
    }
    return dummy.next
}
}