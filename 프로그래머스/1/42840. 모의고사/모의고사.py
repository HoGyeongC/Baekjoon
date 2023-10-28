def solution(answers):
    answer = []
    p1 = [1,2,3,4,5]
    p2 = [2,1,2,3,2,4,2,5]
    p3 = [3,3,1,1,2,2,4,4,5,5]
    
    cntp1 = 0
    cntp2 = 0
    cntp3 = 0
    
    for i in range(len(answers)):
        if answers[i] == p1[i % len(p1)]:
            cntp1 += 1
        if answers[i] == p2[i % len(p2)]:
            cntp2 += 1
        if answers[i] == p3[i % len(p3)]:
            cntp3 += 1
    
    if max(cntp1,cntp2,cntp3) == cntp1:
        answer.append(1)
    if max(cntp1,cntp2,cntp3) == cntp2:
        answer.append(2)
    if max(cntp1,cntp2,cntp3) == cntp3:
        answer.append(3)
    
    
    return answer