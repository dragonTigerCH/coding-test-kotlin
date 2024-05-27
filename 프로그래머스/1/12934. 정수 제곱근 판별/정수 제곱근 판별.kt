import kotlin.math.*
class Solution {
    fun solution(n: Long): Long {
        val squareRoot = sqrt(n.toDouble())
        val plus = squareRoot + 1
        val answer = plus.pow(2).toLong()
        return if(squareRoot.toInt() * squareRoot.toInt() == n.toInt()) answer else -1
    }
}