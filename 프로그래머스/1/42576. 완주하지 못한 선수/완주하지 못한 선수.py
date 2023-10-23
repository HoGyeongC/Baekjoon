def solution(participant, completion):
    dict = {}
    sum = 0
    
    for i in participant:
        dict[hash(i)] = i
        sum += hash(i)
        
    for i in completion:
        sum -= hash(i)
    
    
    return dict[sum]