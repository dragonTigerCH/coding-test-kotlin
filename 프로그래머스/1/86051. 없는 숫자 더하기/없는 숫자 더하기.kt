class Solution {
    fun solution(numbers: IntArray): Int {
        return (0..9).filterNot { numbers.contains(it) }.sum()
    }
}