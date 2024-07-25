def solution(arr):
    result = []
    n = len(arr)
    
    if n == 0:
        return result
    
    for i in range(n - 1):
        if arr[i] != arr[i + 1]:
            result.append(arr[i])
    
    # 마지막 요소는 항상 결과에 추가
    result.append(arr[n - 1])
    
    return result