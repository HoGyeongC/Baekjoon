from collections import deque

def solution(progresses, speeds):
    answer = []
    
    prog = deque(progresses)
    speed = deque(speeds)
    
    while len(prog) > 0:
        cnt = 0
        while len(prog) > 0 and prog[0] >= 100:
            prog.popleft()
            speed.popleft()
            cnt += 1
            
        if cnt != 0:
            answer.append(cnt)
        
        for i in range(len(prog)):
            prog[i] += speed[i]
    
    
    
    return answer