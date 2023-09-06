import sys

N = int(sys.stdin.readline())

for _ in range(N):
  k = int(sys.stdin.readline())
  n = int(sys.stdin.readline())

  arr = []
  for i in range(k+1):
    arr2 = []
    for j in range(n+1):
      if i == 0:
        arr2.append(j+1)
      elif j == 0:
        arr2.append(1)
      else:
        arr2.append(arr[i-1][j]+arr2[j-1])
    arr.append(arr2)
  print(arr[k][n-1])