def solution(N, number):
    if N == number:
        return 1
    
    # dp[i]는 숫자 N을 i번 사용하여 만들 수 있는 값들의 집합
    dp = [set() for _ in range(9)]
    
    # 기본 값 설정
    for i in range(1, 9):
        dp[i].add(int(str(N) * i))
    
    # DP 테이블 갱신
    for i in range(2, 9):
        for j in range(1, i):
            for op1 in dp[j]:
                for op2 in dp[i - j]:
                    dp[i].add(op1 + op2)
                    dp[i].add(op1 - op2)
                    dp[i].add(op1 * op2)
                    if op2 != 0:
                        dp[i].add(op1 // op2)
                    
    # 결과 찾기
    for i in range(1, 9):
        if number in dp[i]:
            return i
    
    return -1