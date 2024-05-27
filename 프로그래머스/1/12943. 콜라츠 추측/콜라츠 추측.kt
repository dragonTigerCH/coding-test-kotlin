class Solution {
    fun solution(num: Int): Int {
        if (num == 1) return 0
        var temp = if (num % 2 == 0) num / 2 else (num * 3) + 1

        for (i in 1..500){
            if (temp == 1) return i
            if (i == 500) return -1
            if (temp % 2 == 0){
                temp /= 2
            } else if (temp % 2 == 1) {
                temp = (temp * 3) + 1
            }
        }
        return -2
    }
}