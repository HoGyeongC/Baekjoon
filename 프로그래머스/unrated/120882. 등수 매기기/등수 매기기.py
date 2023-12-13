def solution(score):
    answer = []
    avg = []
    for s in score:
        avg.append(sum(s)/2)
    
    for i in range(len(avg)):
        rank = 1
        for j in range(len(avg)):
            if avg[i] < avg[j]:
                rank += 1
        answer.append(rank)
    
    return answer