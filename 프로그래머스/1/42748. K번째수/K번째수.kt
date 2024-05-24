class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = mutableListOf<Int>()
        commands.forEach {
            val result = array.copyOfRange(it[0] - 1, it[1]).sorted().get(it[2] - 1)
            answer.add(result)
        }
        return answer.toIntArray()
    }
}