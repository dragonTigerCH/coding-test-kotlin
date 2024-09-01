def solution(triangle):
    # 삼각형의 높이
    n = len(triangle)
    
    # DP 테이블을 삼각형과 같은 크기로 초기화
    dp = [[0] * (i + 1) for i in range(n)]
    
    # 삼각형의 가장 마지막 행을 DP 테이블에 초기화
    dp[-1] = triangle[-1]
    
    # 역순으로 삼각형을 탐색
    for i in range(n - 2, -1, -1):
        for j in range(i + 1):
            # 현재 위치의 값은 현재 값 + 아래쪽 두 값 중 큰 것
            dp[i][j] = triangle[i][j] + max(dp[i + 1][j], dp[i + 1][j + 1])
    
    # 최상위 위치의 값이 최적의 경로 합계
    return dp[0][0]