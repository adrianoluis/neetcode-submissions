/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */



class Solution {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var node: ListNode? = head
        var newHead: ListNode? = head
        var prev: ListNode? = null
        while(node != null) {
            if (node == newHead && node?.`val` == `val`) {
                newHead = node?.next
            } else {
                if (node?.`val` != `val`) {
                    prev = node
                } else {
                    prev?.next = node?.next
                }
            }
            node = node?.next
        }
        return newHead
    }
}
