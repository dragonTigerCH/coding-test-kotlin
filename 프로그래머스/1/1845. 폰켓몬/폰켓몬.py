def solution(nums):
    dupl = len(set(nums))
    sliced = len(nums) / 2
    if sliced < dupl:
        return sliced
    return len(set(nums))