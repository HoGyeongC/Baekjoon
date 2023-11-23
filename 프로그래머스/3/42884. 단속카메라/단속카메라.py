def solution(routes):
    
    routes.sort(key = lambda x:x[0])
    cnt = 0
    end = routes[0][1]
    
    for i in range(1, len(routes)):
        if end < routes[i][0]:
            cnt+=1
            end = routes[i][1]
            continue
        if end > routes[i][1]:
            end = routes[i][1]
    
    return cnt + 1