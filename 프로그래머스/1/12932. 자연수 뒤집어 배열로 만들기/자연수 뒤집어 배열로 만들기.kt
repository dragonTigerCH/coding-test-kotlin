class Solution {
    fun solution(n: Long): IntArray {
        val answer = n.toString().toCharArray().map { it.digitToInt() }.toIntArray()
        answer.reverse()
        return answer
    }
}