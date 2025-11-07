import java.util.*

class Solution {
    fun solution(jobs: Array<IntArray>): Int {
        jobs.sortBy { it[0] }// 요청 시간순 정렬

        val pq = PriorityQueue<IntArray> { a, b -> a[1] - b[1] } // 소요시간 기준
        var time = 0
        var index = 0
        val turnaround = mutableListOf<Int>()

        while (index < jobs.size || pq.isNotEmpty()) {
            // 현재 시간에 들어온 작업들 추가
            while (index < jobs.size && jobs[index][0] <= time) {
                pq.add(jobs[index++])
            }

            if (pq.isEmpty()) {
                println(index)
                time = jobs[index][0] // 다음 요청 시간으로 점프
                continue
            }

            val job = pq.poll()
            time += job[1]
            turnaround += (time - job[0])
        }


        return turnaround.sum() / turnaround.size
    }
}