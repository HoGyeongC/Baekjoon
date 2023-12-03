def solution(my_string):
    string = my_string.lower()
    ss = []
    for s in string:
        ss.append(s)
    ss.sort()
    return ''.join(ss)