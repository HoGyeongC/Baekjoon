from collections import deque
def solution(maps):
    n = len(maps)
    m = len(maps[0])
    
    distance = [[-1 for _ in range(m)] for _ in range(n)]
    distance[0][0]=1
    que = deque()
    que.append((0,0))
    dx = [-1,1,0,0]
    dy = [0,0,-1,1]
    
    while que:
        x, y = que.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            
            if nx >= 0 and nx < n and ny >= 0 and ny < m:
                if maps[nx][ny] == 1 and distance[nx][ny] == -1:
                    que.append((nx,ny))
                if distance[nx][ny] == -1:
                    distance[nx][ny] = distance[x][y] + 1
                else:
                    distance[nx][ny] = min(distance[nx][ny], distance[x][y] + 1)
                
    return distance[n-1][m-1]