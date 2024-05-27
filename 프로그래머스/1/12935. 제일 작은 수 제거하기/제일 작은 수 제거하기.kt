class Solution {
    fun solution(arr: IntArray): IntArray {
        val first = arr.sortedArray().first()
        if (arr.size == 1)
            return intArrayOf(-1)
        return arr.filter { it != first }.toIntArray()
    }
}