def solution(array):
    answer = 0
    maxN = 0
    for n in array:
        if array.count(n) > maxN:
            maxN = array.count(n)
            answer = n
        elif array.count(n) == maxN and answer != n:
            answer = -1
    return answer