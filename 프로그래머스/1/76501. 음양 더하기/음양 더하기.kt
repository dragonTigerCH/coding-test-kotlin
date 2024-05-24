class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        val answer = absolutes.mapIndexed { index, it ->
            if (!signs[index])
                -it
            else it
        }.sum()
        return answer
    }
}