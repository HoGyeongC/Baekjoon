def conf(n):
    cnt = 0
    for i in range(1,n+1):
        if n%i==0:
            cnt += 1
    return cnt

def solution(n):
    cnt = 0
    for i in range(1,n+1):
        if conf(i) >= 3:
            cnt += 1
    return cnt