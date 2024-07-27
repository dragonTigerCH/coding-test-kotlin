import kotlin.math.ceil

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        // 각 작업의 완료일 계산
        val pairedList = progresses.zip(speeds)
        val taskDays = pairedList.map { (progress, speed) ->
            val days = (100 - progress) / speed.toDouble()
            ceil(days).toInt() // 소수점을 올림하여 계산된 날수를 Int로 변환
        }
        
        val answer = mutableListOf<Int>()
        var maxDay = taskDays[0]
        var count = 0
        println(taskDays)
        
        for (day in taskDays) {
            if (day <= maxDay) {
                count++
            } else {
                answer.add(count)
                count = 1
                maxDay = day
            }
        }
        
        // 마지막 그룹의 개수 추가
        answer.add(count)
        
        return answer.toIntArray()
    }
}
