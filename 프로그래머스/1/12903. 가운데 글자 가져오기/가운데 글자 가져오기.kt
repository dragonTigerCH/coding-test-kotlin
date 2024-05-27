class Solution {
    fun solution(s: String): String {
        val divided  = s.length / 2
        return if (s.length % 2 == 1) "${s[divided]}" else "${s[divided-1]}${s[divided]}"
    }
}