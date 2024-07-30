import heapq
import numpy as np


def solution(scoville, K):
    # if(np.all(np.array(scoville) >= K)):
    #     return 0

    count = 0
    heapq.heapify(scoville)
    
    while(len(scoville) > 1):
        min1 = heapq.heappop(scoville)
        if(min1 >= K):
            break
        min2 = heapq.heappop(scoville)
        heapq.heappush(scoville , min1 + (min2 * 2))
        count += 1
    
    if(np.all(np.array(scoville) >= K)):
        return count
    else:
        return -1
