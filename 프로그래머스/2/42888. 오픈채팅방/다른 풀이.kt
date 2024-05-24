class Solution {
    fun solution(record: Array<String>): Array<String> {
        val user = mutableMapOf<String, String>()
        
        return record
            .map {
                val r = it.split(" ")
                val action = r.first()
                when (action) {
                    "Enter", "Change" -> user += r[1] to r[2]
                }
                r
            }
            .asSequence()
            .filter { it[0] != "Change" }
            .map {
                val nickName = user[it[1]]
                val explanation = when (it[0]) {
                    "Enter" -> "님이 들어왔습니다."
                    "Leave" -> "님이 나갔습니다."
                    else -> throw IllegalArgumentException()
                }
                "$nickName$explanation"
            }
            .toList().toTypedArray()
    }
}
