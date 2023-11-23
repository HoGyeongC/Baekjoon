import heapq

def solution(people, limit):
    people.sort()
    l = len(people) - 1
    s = 0
    cnt = 0
    
    while s <= l:
        if s == l:
            cnt += 1
            break
        else:
            if people[s] + people[l] <= limit:
                s += 1
                l -= 1
                cnt += 1
            else:
                l -= 1
                cnt += 1
            
    
    return cnt