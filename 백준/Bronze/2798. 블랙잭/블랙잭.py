import sys

N, M = map(int, input().split())

arr = []

arr = list(map(int, input().split()))

result = 0
for i in range(N-2):
    for j in range(i+1, N):
        for k in range(j+1, N):
            num = arr[i] + arr[j] + arr[k]
            if M >= num and M - num < M - result:
                result = num

print(result)