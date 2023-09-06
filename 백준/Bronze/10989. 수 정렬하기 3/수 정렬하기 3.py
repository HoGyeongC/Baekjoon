import sys

N = int(sys.stdin.readline())

arr = [0] * (10000)
for i in range(N):
  arr[int(sys.stdin.readline()) - 1] += 1

for i in range(len(arr)):
  if arr[i] != 0:
    for _ in range(arr[i]):
      print(i+1)