import heapq

def solution(jobs):
    jobs.sort()  # 요청 시간 순으로 정렬
    n = len(jobs)
    current_time = 0
    total_time = 0
    job_index = 0
    heap = []
    
    while job_index < n or heap:
        # 현재 시간 이전에 요청된 작업들을 힙에 추가
        while job_index < n and jobs[job_index][0] <= current_time:
            heapq.heappush(heap, (jobs[job_index][1], jobs[job_index][0]))
            job_index += 1
        
        if heap:
            # 가장 짧은 작업 선택
            duration, request_time = heapq.heappop(heap)
            current_time += duration
            total_time += current_time - request_time
        else:
            # 대기 중인 작업이 없으면 다음 작업의 요청 시간으로 이동
            current_time = jobs[job_index][0]
    
    return total_time // n