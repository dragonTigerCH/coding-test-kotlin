import java.util.*

class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        val queue: Queue<Pair<Int, Int>> = LinkedList<Pair<Int, Int>>()
        priorities.forEachIndexed { index, it ->
            queue.offer(Pair(index, it))
        }
        var count = 0
        while(queue.isNotEmpty()) {
            val (index, item) = queue.poll()
            if(queue.any{it.second > item}) {
                queue.offer(Pair(index, item)) 
            } else {
                count++
                if(index == location) return count
            }
        }
        return count
    }
}