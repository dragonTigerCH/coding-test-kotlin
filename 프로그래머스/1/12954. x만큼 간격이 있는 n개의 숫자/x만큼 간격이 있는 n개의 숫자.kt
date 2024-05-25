class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = longArrayOf()
        for (i in 1 until n+1) {
            answer += x*i.toLong()
        }
        return answer
    }
}