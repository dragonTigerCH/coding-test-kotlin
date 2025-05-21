class Solution {
    fun solution(my_string: String): String {
        // my_string을 CharArray로 변환 후 Set에 담아 중복 제거
        // Set을 순회하며 중복 없는 새 문자열 생성
        val charArray = my_string.toCharArray()
        val stringBuffer = StringBuffer()
        val set = LinkedHashSet<Char>()
        for (char in charArray) {
            set.add(char)
        }
        for (element in set){
            stringBuffer.append(element)
        }
        val result = stringBuffer.toString()
        return result
    }
}