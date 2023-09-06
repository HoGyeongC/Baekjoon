import sys

N = int(sys.stdin.readline())

cnt = 1
i = 1
while N > i:
  i += cnt * 6
  cnt += 1
  
print(cnt)