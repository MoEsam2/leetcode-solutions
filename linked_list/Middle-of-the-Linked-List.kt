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
 fun middleNode(head: ListNode?): ListNode? {
    var size = 0
    var current = head
    while (current != null){
        size++
        current = current.next
    }
    var index =0
    current = head
    var currentNode :ListNode
    while (current!= null ){
        if (index == size/2) {
            currentNode = current
            return currentNode
        }
        index++
        current = current.next
    }
    return null
}
}