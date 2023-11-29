def solution(n, numlist):
    answer = []
    for nn in numlist:
        if nn % n == 0:
            answer.append(nn)
    return answer