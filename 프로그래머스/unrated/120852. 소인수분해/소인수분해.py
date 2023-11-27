def divide(n):
    cnt = 0
    for i in range(1,n+1):
        if n%i==0:
            cnt += 1
    return cnt

def solution(n):
    answer = []
    for i in range(1,n+1):
        if divide(i)==2 and n%i==0:
            answer.append(i)
    
    return answer