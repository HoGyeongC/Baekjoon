def solution(my_string, num1, num2):
    answer = ''
    s1 = my_string[num1]
    s2 = my_string[num2]
    for i in range(len(my_string)):
        if i == num1:
            answer += s2
            continue
        if i == num2:
            answer += s1
            continue
        answer+=my_string[i]
    return answer