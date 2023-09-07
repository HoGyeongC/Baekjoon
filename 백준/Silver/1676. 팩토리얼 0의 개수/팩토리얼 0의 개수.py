import sys

N = int(sys.stdin.readline())

p = 1
for i in range(N):
  p *= i+1

i = 10
j = 0
while i <= p:
  if p % i != 0:
    break
  j += 1
  i *= 10

print(j)