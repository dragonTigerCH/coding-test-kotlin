class Solution {
    fun solution(n: Int): String {
        val answer = "수박".repeat(n)
        return answer.substring(0, n)
    }
}