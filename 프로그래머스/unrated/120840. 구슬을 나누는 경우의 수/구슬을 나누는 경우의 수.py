def fact(n):
    result = 1
    for i in range(1, n+1):
        result *= i
    return result

def solution(balls, share):
    answer = fact(balls) // (fact(balls-share) * fact(share))
    return answer