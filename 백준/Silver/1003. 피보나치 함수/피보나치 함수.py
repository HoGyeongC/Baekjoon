import sys

N = int(sys.stdin.readline())
for _ in range(N):
  n = int(sys.stdin.readline())
  cnt0 = [1,0]
  cnt1 = [0,1]
  for i in range(2, n+1):
    cnt0.append(cnt1[i-1])
    cnt1.append(cnt0[i-1]+ cnt1[i-1])

  print(cnt0[n], cnt1[n])
