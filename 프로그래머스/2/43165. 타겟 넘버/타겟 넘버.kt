class Solution {
    var answer = 0
    fun solution(numbers: IntArray, target: Int): Int {
        dfs(numbers, 0, target, 0)
        return answer
    }
    
    private fun dfs(numbers: IntArray, depth : Int, target: Int, calc: Int) {
        if(depth == numbers.size) {
            if(target == calc)
                answer++
            return 
        } else {
            dfs(numbers, depth + 1, target, calc + numbers[depth])
            dfs(numbers, depth + 1, target, calc - numbers[depth])
        }
    }
}

