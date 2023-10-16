def solution(n, words):
    answer = []

    before = []
    flag = 0
    for i in range(len(words)):
        if words[i] in before:
                flag = 1   
                break;                
        if i != 0:
            if words[i-1][-1] != words[i][0]:
                flag = 1
                break
        before.append(words[i])

    if flag == 0:
        answer.append(0)
        answer.append(0)
    if flag == 1:
        if (i+1)%n == 0:
            answer.append(n)
        else:
            answer.append((i+1)%n)
        answer.append(int((i+n)/n))
            

    return answer