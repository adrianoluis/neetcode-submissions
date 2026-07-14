class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        val queue = LinkedList<Char>()
        s.forEach(queue::offer)
        t.forEach { chr ->
            if (queue.peek() == chr) {
                queue.poll()
            }
        }
        return queue.isEmpty()
    }
}
