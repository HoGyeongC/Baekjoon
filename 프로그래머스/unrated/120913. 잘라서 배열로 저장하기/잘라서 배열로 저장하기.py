def solution(my_str, n):
    answer = []
    string=""
    for i in range(len(my_str)):
        if i % n == 0 and i != 0:
            answer.append(string)
            string=""
        string += my_str[i]
    answer.append(string)
    return answer