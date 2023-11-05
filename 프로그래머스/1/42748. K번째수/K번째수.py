def solution(array, commands):
    answer = []
    for i in commands:
        silce = array[i[0]-1:i[1]]
        silce.sort()
        answer.append(silce[i[2]-1])
        
    return answer