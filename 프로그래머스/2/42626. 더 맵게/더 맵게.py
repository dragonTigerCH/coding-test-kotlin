import heapq
import numpy as np


def solution(scoville, K):
    # 처음 배열원소가 모두 K보다 스코빌지수가 높을때
    if(np.all(np.array(scoville) >= K)):
        return 0

    # 힙에 스코빌지수를 넣어주고
    count = 0
    heapq.heapify(scoville)
    
    # 스코빌지수의 값이 1이 되면 종료
    while(len(scoville) > 1):
        min1 = heapq.heappop(scoville)
        # 최소값이 K보다 높으면 종료
        if(min1 >= K):
            break
        # 아니면 힙 푸쉬
        min2 = heapq.heappop(scoville)
        heapq.heappush(scoville , min1 + (min2 * 2))
        count += 1
    
    # 최종 원소가 K 보다 작을 수도 있으니 체크
    if(np.all(np.array(scoville) >= K)):
        return count
    else:
        return -1
