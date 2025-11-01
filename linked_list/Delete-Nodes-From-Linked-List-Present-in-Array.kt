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
fun modifiedList(nums: IntArray, head: ListNode?): ListNode? {
    val numbers = nums.toHashSet()
    val dummy = ListNode(0)
    dummy.next = head
    var prev =  dummy
    var current = head
    while (current != null) {
        val value = current.`val`
        if (value in numbers) {
            prev?.next = current.next
        } else {
            prev = current
        }
        current = current.next
    }
    return dummy.next
}
}