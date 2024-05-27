class Solution {
    fun solution(n: Long): Long {
      return n.toString().toCharArray().map{it.digitToInt()}.sortedDescending().joinToString("").toLong()
    }
}