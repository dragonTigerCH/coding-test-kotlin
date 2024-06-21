class Solution {
    fun solution(my_string: String, s: Int, e: Int): String {
        val piece = my_string.substring(s,e +1).reversed()
        val builder = StringBuilder(my_string)
        return builder.replaceRange(s, e +1, piece).toString()
    }
}