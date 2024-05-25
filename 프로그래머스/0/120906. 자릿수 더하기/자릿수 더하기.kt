class Solution {
    fun solution(n: Int): Int {
        return n.toString().toCharArray().map {it.digitToInt()}.sum()
    }
}