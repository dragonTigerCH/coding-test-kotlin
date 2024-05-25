class Solution {
    fun solution(my_string: String, letter: String): String {
        val charArray = letter.toCharArray()
        val answer = my_string.filter { (it != charArray[0]) }
        return answer
    }
}