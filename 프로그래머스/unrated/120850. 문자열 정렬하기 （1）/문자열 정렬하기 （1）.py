def solution(my_string):
    answer = []
    for s in my_string:
        if ord(s) >= ord('0') and ord(s) <= ord('9'):
            answer.append(int(s))
    answer.sort()
    return answer