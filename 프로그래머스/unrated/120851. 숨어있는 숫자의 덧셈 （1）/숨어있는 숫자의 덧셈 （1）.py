def solution(my_string):
    answer = 0
    for s in my_string:
        if ord(s) >= ord('0') and ord(s) <= ord('9'):
            answer += int(s)
    
    return answer