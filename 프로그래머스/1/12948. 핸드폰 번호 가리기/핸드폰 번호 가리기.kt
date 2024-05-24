class Solution {
    fun solution(phone_number: String): String {
        return phone_number.lastFour()
    }
    private fun String.lastFour(): String {
        return "*".repeat(length - 4) + substring(length - 4, length)
    }
}