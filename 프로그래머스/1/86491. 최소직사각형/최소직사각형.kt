class Solution {
     fun solution(sizes: Array<IntArray>): Int {
        var maxWidth = 0
        var maxHeight = 0

        for (size in sizes) {
            val (w, h) = size
            val width = maxOf(w, h)
            val height = minOf(w, h)
            maxWidth = maxOf(maxWidth, width)
            maxHeight = maxOf(maxHeight, height)
        }
        return maxWidth * maxHeight
    }
}