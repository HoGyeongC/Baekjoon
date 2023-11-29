def solution(my_string):
    string = my_string.split(" ")
    answer = int(string[0])
    i=1
    while i<len(string):
        if string[i] == '+':
            answer += int(string[i+1])
            i+=2
        elif string[i] == '-':
            answer -= int(string[i+1])
            i+=2
            
    return answer