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
    val map = hashMapOf<Node, Node>()
    var current = node
    while (current != null) {
        map[current] = Node(current.`val`)
        current = current.next
    }
    current = node
    while (current != null) {
        val copy = map[current]
        copy?.next = map[current.next]
        copy?.random = map[current.random]
        current = current.next
    }
    return map[node]
}
}