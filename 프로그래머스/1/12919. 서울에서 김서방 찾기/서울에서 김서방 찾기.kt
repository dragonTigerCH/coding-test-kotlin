class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = "김서방은 없다"
        seoul.forEachIndexed { index, item ->
            if (item == "Kim") {
                return "김서방은 ${index}에 있다"    
            } 
        }
        return answer
    }
}