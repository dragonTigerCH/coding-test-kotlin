class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        val size = score.size / m
        score.sortDescending()
        for (i in 0 until size) {
            val min = score.copyOfRange(i * m, (i + 1) * m).minOrNull()
            answer += min!! * m * 1
        }
        return answer
    }
}