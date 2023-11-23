from collections import deque

def solution(queue1, queue2):
    answer = 0
    que1 = deque(queue1)
    que2 = deque(queue2)
    sum1 = sum(que1)
    sum2 = sum(que2)
    if((sum(que1)+sum(que2)) % 2 != 0):
        return -1
    
    while answer < (len(que1) + len(que2))*2:
        if sum1 == sum2:
            return answer
        elif sum1 < sum2:
            n = que2.popleft()
            que1.append(n)
            sum1 += n
            sum2 -= n
        else:
            n = que1.popleft()
            que2.append(n)
            sum1 -= n
            sum2 += n
        answer+=1
    
    
    return -1