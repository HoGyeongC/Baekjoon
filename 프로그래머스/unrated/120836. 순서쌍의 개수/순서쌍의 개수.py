def solution(n):
    answer = 0
    for i in range(1,round(n**(1/2))+1):
        if n % i == 0:
            answer+=1
    answer*=2
    if (n**(1/2))%1==0.0:
        print("*")
        answer-=1
    return answer