import kotlin.math.*

class Solution {
    fun solution(a: Int, b: Int): Int {
        val aAbsorption = a.toString().plus(b.toString()).toInt()
        val bAbsorption = b.toString().plus(a.toString()).toInt()
        
        return max(aAbsorption, bAbsorption)
    }
}