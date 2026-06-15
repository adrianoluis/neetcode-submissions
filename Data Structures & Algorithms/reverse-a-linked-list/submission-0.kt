/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
     fun reverseList(head: ListNode?): ListNode? {
        var reversedHead: ListNode? = null
        var currNode = head
        while (currNode != null) {
            if (reversedHead == null) {
                reversedHead = ListNode(currNode.`val`)
            } else {
                reversedHead = ListNode(currNode.`val`).apply { 
                    next = reversedHead
                }
            }
            currNode = currNode.next
        }
        return reversedHead
    }
}
