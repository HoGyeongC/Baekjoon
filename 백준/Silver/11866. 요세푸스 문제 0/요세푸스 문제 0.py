import sys

N, K = map(int, input().split())

arr = []
for i in range(N):
  arr.append(i+1)

print("<", end = "")
i = 0
for _ in range(N - 1):
  i += K - 1
  while i > len(arr) - 1:
    i -= len(arr)
  print(arr[i], end = ", ")
  arr.remove(arr[i])

print(str(arr[0]) + ">")