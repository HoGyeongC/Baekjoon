import sys
from collections import deque

n = int(sys.stdin.readline())

for _ in range(n):
  N, M = map(int, sys.stdin.readline().split())
  que = deque(list(map(int, sys.stdin.readline().split())))

  cnt = 0
  while True:
    quemax = max(que)
    queNow = que.popleft()
    if quemax != queNow:
      que.append(queNow)
    elif M == 0:
      print(cnt + 1)
      break
    else:
      cnt += 1
    M -= 1
    if M == -1:
      M = len(que) - 1
      