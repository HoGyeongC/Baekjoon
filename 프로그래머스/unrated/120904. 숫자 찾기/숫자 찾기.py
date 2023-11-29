def solution(num, k):
    i=0
    Max = 0
    while num >0:
        i+=1
        if num % 10 == k:
            Max = i
        num = num // 10
        
    if Max != 0:
        return i-Max+1
    return -1