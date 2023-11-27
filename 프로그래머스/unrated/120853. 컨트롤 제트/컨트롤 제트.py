def solution(s):
    answer = 0
    ss = s.split(" ")
    prev=0
    for sss in ss:
        if sss == "Z":
            answer -= prev
        else:
            answer += int(sss)
            prev = int(sss)
    return answer