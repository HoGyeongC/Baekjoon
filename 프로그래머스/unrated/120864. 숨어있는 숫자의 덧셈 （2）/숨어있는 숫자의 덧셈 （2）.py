def solution(my_string):
    answer = 0
    i=0
    while i < len(my_string):
        num = 0
        flag = 0
        while i < len(my_string) and my_string[i].isdigit() == True:
            num *= 10
            num += int(my_string[i])
            i+=1
            flag = 1
        if flag == 0:
            i += 1
        answer += num
    return answer