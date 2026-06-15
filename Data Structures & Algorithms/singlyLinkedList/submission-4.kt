class LinkedList {

    private var head: Node? = null

    private var tail: Node? = null

    private var size = 0

    fun get(index: Int): Int {
        var i = 0
        var node = head
        while (node != null) {
            if (i++ == index) {
                break
            }
            node = node.next
        }
        return node?.value ?: -1
    }

    fun insertHead(value: Int) {
        head = Node(value, head)
        if (tail == null) {
            tail = head
        }
        size++
    }

    fun insertTail(value: Int) {
        val prevTail = tail
        tail = Node(value)
        prevTail?.next = tail
        // init head when none
        if (head == null) {
            head = tail
        } else if (head?.next == null) {
            head?.next = tail
        }
        size++
    }

    fun remove(index: Int): Boolean {
        // index greater than list size
        if (index >= size) return false
        if (index == 0) {
            head = head?.next
            return true
        }
        var i = 0
        var node = head
        var prevNode: Node? = null
        while (i < size) {
            if (i++ < index) {
                prevNode = node
                node = node?.next
                continue
            }
            prevNode?.next = node?.next
            size--
            return true
        }
        return false
    }

    fun getValues(): List<Int> {
        val result = mutableListOf<Int>()
        var node = head
        while (node != null) {
            result.add(node.value)
            node = node.next
        }
        return result
    }

    internal data class Node(val value: Int, var next: Node? = null) {}
}