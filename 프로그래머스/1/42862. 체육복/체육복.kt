class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {

        var answer = 0
        var newLost = lost.toMutableList().sorted().toMutableList()
        var newReserve = reserve.toMutableList().sorted().toMutableList()
        //도난 당한 사람중에 여벌인 사람 제거
        newLost.intersect(newReserve).forEach {
            newLost.remove(it)
            newReserve.remove(it)
        }
        //잃어버린 사람들을 기준으로
        var count = 0
        newLost.forEach {
            if(newReserve.contains(it - 1)) {
                newReserve.remove(it - 1)
                count++
            } else if (newReserve.contains(it + 1)) {
                newReserve.remove(it + 1)
                count++
            }
        }
        
        return n - newLost.size + count
    }
}