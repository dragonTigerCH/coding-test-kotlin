class Solution {
    fun solution(n: Int): Int {
        return (1..n).filter { it % 2 == 0 }.sum()
    }
}