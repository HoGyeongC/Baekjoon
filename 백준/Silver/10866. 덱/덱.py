from collections import deque
import sys

N = int(input())

dq = deque()
cnt = 0

for i in range(N):
  cmd = sys.stdin.readline().split()
  if cmd[0] == "push_front":
    n = int(cmd[1])
    dq.appendleft(n)
    cnt+=1
  elif cmd[0] == "push_back":
    n = int(cmd[1])
    dq.append(n)
    cnt+=1
  elif cmd[0] == "pop_front":
    if cnt <= 0:
      print(-1)
    else:
      print(dq.popleft())
      cnt -= 1
  elif cmd[0] == "pop_back":
    if cnt <= 0:
      print(-1)
    else:
      print(dq.pop())
      cnt -= 1
  elif cmd[0] == "size":
    print(cnt)
  elif cmd[0] == "empty":
    if cnt == 0:
      print(1)
    else:
      print(0)
  elif cmd[0] == "front":
    if cnt == 0:
      print(-1)
    else:
      print(dq[0])
  elif cmd[0] == "back":
    if cnt == 0:
      print(-1)
    else:
      print(dq[-1])
  