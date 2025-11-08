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
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    var firstPointer = list1
    var secPointer = list2
    val dummy = ListNode(0)
    var tail = dummy
    while (firstPointer != null && secPointer != null) {
        if (firstPointer.`val` <= secPointer.`val`) {
            tail.next = ListNode(firstPointer.`val`)
            tail = tail.next!!
            firstPointer = firstPointer.next
        }else{
            tail.next = ListNode(secPointer.`val`)
            tail=tail.next!!
            secPointer = secPointer.next
        }
    }
    if (firstPointer != null) {
        tail.next = firstPointer
    }

    if (secPointer != null) {
        tail.next = secPointer
    }
    return dummy.next
}
}