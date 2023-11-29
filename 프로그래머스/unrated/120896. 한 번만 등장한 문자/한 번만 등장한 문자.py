def solution(s):
    answer = ''
    S = s.split()
    result=[]
    for ss in s:
        if s.count(ss) == 1:
            result.append(ss)
    result.sort()
    answer = ''.join(result)
    return answer