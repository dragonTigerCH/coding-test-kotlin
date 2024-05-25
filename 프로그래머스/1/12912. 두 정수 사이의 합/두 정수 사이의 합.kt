import kotlin.math.*
class Solution {
    fun solution(a: Int, b: Int): Long {
        val min = min(a, b)
        val max = max(a, b)
        var answer: Long = 0
        for (i in min until max + 1) {
            answer += i
        }
        return answer
    }
}