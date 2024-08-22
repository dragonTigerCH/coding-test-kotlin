class Solution {
 fun solution(number: String, k: Int): String {
    val stack = mutableListOf<Char>()
    var toRemove = k

    for (char in number) {
        // 현재 숫자가 스택의 마지막 숫자보다 클 때까지 제거
        while (toRemove > 0 && stack.isNotEmpty() && stack.last() < char) {
            stack.removeAt(stack.size - 1)
            toRemove--
        }
        stack.add(char)
    }

    // 아직 제거해야 할 숫자가 남아 있으면 스택의 마지막에서 제거
    while (toRemove > 0) {
        stack.removeAt(stack.size - 1)
        toRemove--
    }

    return stack.joinToString("")
}
}