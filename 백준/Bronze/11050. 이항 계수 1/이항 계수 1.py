import sys

N, M = map(int, input().split())

result = 1

for i in range(M):
    result *= N - i

for i in range(M):
    result /= i+1

print(int(result))