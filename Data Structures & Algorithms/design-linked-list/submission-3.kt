class MyLinkedList() {

    private var head: ListNode? = null

    private var tail: ListNode? = null

    private var size = 0

    fun get(index: Int):Int =
        when (index) {
            0 -> head?.value
            (size - 1) -> tail?.value
            else -> {
                var i = 1
                var node = head?.next
                while (i < size) {
                    if (i++ == index) {
                        break
                    }
                    node = node?.next
                }
                node?.value
            }
        } ?: -1

    fun addAtHead(`val`: Int) {
        val node = ListNode(`val`, next = head)
        head?.prev = node
        head = node
        if (tail == null) {
            tail = head
        }
        size++
    }

    fun addAtTail(`val`: Int) {
        val node = ListNode(`val`, prev = tail)
        tail?.next = node
        tail = node
        size++
    }

    fun addAtIndex(index: Int, `val`: Int) =
        when (index) {
            0 -> addAtHead(`val`)
            size -> addAtTail(`val`)
            else -> {
                var i = 1
                var node = head?.next
                while (i < size) {
                    if (i++ == index) {
                        val newNode = ListNode(`val`, prev = node?.prev, next = node)
                        node?.prev?.next = newNode
                        node?.prev = newNode
                        size++
                        break
                    }
                    node = node?.next
                }
            }
        }

    fun deleteAtIndex(index: Int) {
        // index greater than list size
        if (index >= size) return
        if (index == 0) {
            head = head?.next
            head?.prev = null
            return
        }
        var i = 1
        var node = head?.next
         while (i < size) {
            if (i++ == index) {
                if (node == tail) tail = node?.prev
                node?.next?.prev = node.prev
                node?.prev?.next = node.next
                size--
                break
            }
            node = node?.next
        }
    }

    private data class ListNode(val value: Int, var prev: ListNode? = null, var next: ListNode? = null) {
        override fun toString(): String {
            return "Node(value=$value)"
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = MyLinkedList()
 * var param_1 = obj.get(index)
 * obj.addAtHead(`val`)
 * obj.addAtTail(`val`)
 * obj.addAtIndex(index,`val`)
 * obj.deleteAtIndex(index)
 */