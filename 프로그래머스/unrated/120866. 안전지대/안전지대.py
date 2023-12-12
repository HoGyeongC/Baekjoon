def solution(board):
    answer = 0
    
    n = len(board)
    
    safeboard = [[0 for _ in range(n)] for _ in range(n)]
    
    for i in range(n):
        for j in range(n):
            if board[i][j] == 1:
                if i - 1 >= 0:
                    if j - 1 >= 0:
                        safeboard[i-1][j-1] = 1
                    if j + 1 < n:
                        safeboard[i-1][j+1] = 1
                    safeboard[i-1][j] = 1
                if i + 1 < n:
                    if j - 1 >= 0:
                        safeboard[i+1][j-1] = 1
                    if j + 1 < n:
                        safeboard[i+1][j+1] = 1
                    safeboard[i+1][j] = 1
                if j - 1 >= 0:
                    safeboard[i][j-1] = 1
                if j + 1 < n:
                    safeboard[i][j+1] = 1
    for i in range(n):
        for j in range(n):
            if safeboard[i][j] != 1 and board[i][j] == 0:
                answer += 1
    
    return answer