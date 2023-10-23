def solution(nums):
    answer = 0
    
    diff = []
    for i in nums:
        if i  not in diff:
            diff.append(i)
            
    if len(diff)>= len(nums)/2: return len(nums)/2
    else: return len(diff)
    
    
    return answer