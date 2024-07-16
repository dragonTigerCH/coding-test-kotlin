from collections import defaultdict
def solution(clothes):
    
    # 의상의 종류별로 개수를 저장할 딕셔너리
    clothes_dict = defaultdict(int)
    
    # 각 의상을 종류별로 카운트
    for item, category in clothes:
        clothes_dict[category] += 1
    
    # 경우의 수 계산
    combinations = 1
    for count in clothes_dict.values():
        combinations *= (count + 1)
    
    # 아무 것도 입지 않는 경우 1가지를 제외
    return combinations - 1