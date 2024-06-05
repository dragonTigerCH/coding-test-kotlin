import kotlin.math.*
class Solution {
    fun solution(a: Int, b: Int): Int {
        val plus = a.toString().plus(b.toString()).toInt()
        val result = max(plus, 2*a*b)
        return result
    }
}