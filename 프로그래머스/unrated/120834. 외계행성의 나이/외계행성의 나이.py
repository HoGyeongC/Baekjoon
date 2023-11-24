def solution(age):
    answer = ''
    
    while age > 0:
        answer += chr(age%10 + ord('a'))
        age = age//10
    
    result = ''
    for i in range(len(answer) - 1,-1,-1):
        result += answer[i]
    
    return result