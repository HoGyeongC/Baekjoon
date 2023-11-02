import sys

N = int(sys.stdin.readline().strip())

if N == 0:
  print(0)
else:
  level = []
  for _ in range(N):
    level.append(int(sys.stdin.readline().strip()))

  level.sort()

  n = (int)(N*0.15 + 0.5)

  summ = sum(level[n:N-n])

  print((int)(summ/(N-2*n)+0.5))