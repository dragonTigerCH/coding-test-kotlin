import kotlin.math.min
class Solution {
    fun solution(X: String, Y: String): String {
        
        var answer = ""
        val strings = (9 downTo 0).toList().map { it.toString() }
        for (ch in strings) {
            val min = min(
                X.count { it.toString() == ch },
                Y.count { it.toString() == ch }
            )
            answer += ch.repeat(min)
        }
        if (answer.isEmpty()) answer = "-1"
        if (answer.toList().distinct() == listOf('0')) answer = "0"

        return answer
    }
}