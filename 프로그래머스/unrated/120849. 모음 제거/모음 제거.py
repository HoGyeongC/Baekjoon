def solution(my_string):
    answer = ''
    moum = ['a','e','i','o','u']
    for s in my_string:
        if s not in moum:
            answer += s
    return answer