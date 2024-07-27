def solution(s):
    # 스택을 초기화합니다.
    stack = []
    
    # 문자열 s를 순회합니다.
    for char in s:
        if char == '(':
            # 여는 괄호를 만나면 스택에 추가합니다.
            stack.append(char)
        elif char == ')':
            # 닫는 괄호를 만나면 스택에서 여는 괄호를 제거합니다.
            if not stack:
                # 스택이 비어 있는데 닫는 괄호가 나타나면 올바르지 않은 괄호입니다.
                return False
            stack.pop()
    
    # 모든 문자를 처리한 후 스택이 비어 있으면 올바른 괄호입니다.
    return len(stack) == 0