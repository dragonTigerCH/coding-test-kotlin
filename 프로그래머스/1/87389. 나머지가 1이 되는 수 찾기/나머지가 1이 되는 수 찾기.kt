class Solution {
    fun solution(n: Int): Int {
        for (x in 1..n) { if (n % x == 1) return x }
        return -1
    }
}