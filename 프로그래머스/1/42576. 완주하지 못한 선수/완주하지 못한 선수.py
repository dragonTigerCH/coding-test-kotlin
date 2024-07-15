from collections import Counter
def solution(participant, completion):
    result = Counter(participant) - Counter(completion)
    return "".join(result)