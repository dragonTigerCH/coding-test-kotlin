class Solution {
    fun solution(x: Int): Boolean {
        val sum = x.toString().map { it.digitToInt() }.sum()
        if (x % sum == 0)
            return true
        return false
    }
}