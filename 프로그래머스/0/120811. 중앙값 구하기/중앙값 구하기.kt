class Solution {
    fun solution(array: IntArray): Int {
        return array.sortedDescending()[array.size / 2]
    }
}