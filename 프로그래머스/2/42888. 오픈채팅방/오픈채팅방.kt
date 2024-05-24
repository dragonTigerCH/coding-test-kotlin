class Solution {
    fun solution(record: Array<String>): Array<String> {
        var uIdAndNickname = mutableMapOf<String, String>()
        record.forEach {
            val split = it.split(" ")
            if (split[0] == "Enter" || split[0] == "Change"){
                uIdAndNickname += split[1] to split[2]
            }
        }
        var answer = arrayOf<String>()
        record.map { it.split(" ") }.forEach {
            when(it[0]){
                "Enter" -> answer += "${uIdAndNickname[it[1]]}님이 들어왔습니다."
                "Leave" -> answer += "${uIdAndNickname[it[1]]}님이 나갔습니다."
            }
        }
        return answer
    }
}