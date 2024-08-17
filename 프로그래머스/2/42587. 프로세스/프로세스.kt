import java.util.*

class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        val queue: Queue<Int> = LinkedList<Int>()
        priorities.forEach {
            queue.offer(it)
        }
        println(queue)
        val item = queue.peek()
        println(item)
        return 1
    }
}