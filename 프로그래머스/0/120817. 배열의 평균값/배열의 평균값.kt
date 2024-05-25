class Solution {
    fun solution(numbers: IntArray): Double {
        return numbers.map { it.toDouble() }.sum() / numbers.size
    }
}