class Solution {
    fun solution(num: Int): Int = collatzAlgorithm(num.toLong(),0)

    tailrec fun collatzAlgorithm(n:Long, c:Int):Int =
        when{
            c > 500 -> -1
            n == 1L -> c
            else -> collatzAlgorithm(if( n%2 == 0L ) n/2 else (n*3)+1, c+1)
        }
}
