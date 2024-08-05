 class Solution {
        fun solution(numbers: IntArray): String {
            val result = numbers.map { it.toString() }
                .sortedWith { a,b -> (b+a).toInt() - (a+b).toInt() }
            return if(result[0] == "0") "0" else result.joinToString("")
        }
    }