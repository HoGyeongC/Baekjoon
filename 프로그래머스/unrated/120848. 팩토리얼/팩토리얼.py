def factorial(n):
    a=1
    for i in range(1,n+1):
        a *= i
    return a

def solution(n):
    for i in range(1,11):
        if factorial(i) > n:
            return i-1
    return i