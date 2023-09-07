import sys

N = int(sys.stdin.readline())

xy_arr = []

for i in range(N):
  xy = list(map(int, sys.stdin.readline().split()))
  xy_arr.append(xy)

xy_arr.sort(key = lambda x : (x[1], x[0]))


for i in xy_arr:
  print(i[0],i[1])