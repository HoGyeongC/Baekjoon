def solution(citations):

    for h in range(len(citations),-1,-1) :
        count = 0
        for ci in citations :
            if (ci >= h) : count += 1
        if count >= h  :
            return h

    return 0