import sys

N = int(input())

arr = []

for _ in range(N):
    arr.append(int(sys.stdin.readline()))

arr = sorted(arr)

for i in range(N):
    print(arr[i])