def solution(s):
    answer = []
    
    
    for i in range(len(s)):
        if s[i] == "(":
            answer.append(s[i])
        if s[i] == ")":
            if len(answer) == 0:
                return False
            answer.pop()
            
    if len(answer) != 0:
        return False

    return True