def solution(quiz):
    answer = []
    
    for q in quiz:
        str = q.split(" ")
        if str[1] =='-':
            if (int)(str[4]) == (int)(str[0]) - (int)(str[2]):
                answer.append("O")
            else:
                answer.append("X")
        if str[1] =='+':
            if (int)(str[4]) == (int)(str[0]) + (int)(str[2]):
                answer.append("O")
            else:
                answer.append("X")        
    
    return answer