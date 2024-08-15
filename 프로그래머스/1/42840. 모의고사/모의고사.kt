class Solution {
    fun solution(answers: IntArray): IntArray {
        
        val pattern1 = intArrayOf(1, 2, 3, 4, 5)
        val pattern2 = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        val pattern3 = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)

        
        var count = IntArray(3)
        for (i in answers.indices) {
            if (answers[i] == pattern1[i % pattern1.size]) count[0]++
            if (answers[i] == pattern2[i % pattern2.size]) count[1]++
            if (answers[i] == pattern3[i % pattern3.size]) count[2]++
        }
         val maxScore = count.maxOrNull() ?: 0
 
        return count
            .mapIndexed { index, score -> index + 1 to score }
            .filter { it.second == maxScore }
            .map { it.first }
            .toIntArray()
    }
}