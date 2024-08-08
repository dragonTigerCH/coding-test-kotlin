class Solution {
    fun solution(citations: IntArray): Int {
        for (x in 1..citations.size) {
            val answer = citations.filter { x <= it }.size
            val remain = citations.size - answer
            if (x >= answer && remain <= answer)
                return answer
        }
        return 0
    }
}