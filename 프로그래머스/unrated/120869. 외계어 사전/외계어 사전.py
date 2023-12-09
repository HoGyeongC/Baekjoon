def solution(spell, dic):
    answer = 0
    for d in dic:
        flag = 1
        for s in spell:
            if d.count(s) != 1:
                flag = 0
                break
        if flag == 1:
            return 1
    return 2