import sys

N = int(sys.stdin.readline())

str = sys.stdin.readline()

H = 0
for i in range(N):
  H += int(ord(str[i]) - ord('a') + 1) * (31 ** i)

print(H)