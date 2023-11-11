import sys

N = int(sys.stdin.readline())

arr = []
for _ in range(N):
  arr.append(int(sys.stdin.readline()))

print(round(sum(arr)/N))
arr.sort()
print(arr[N//2])

dic = {}
for i in arr:
  if i in dic:
    dic[i] += 1
  else:
    dic[i] = 1

mx = max(dic.values())
maxArr = []
for i in dic:
  if mx == dic[i]:
    maxArr.append(i)

if len(maxArr) > 1:
  maxArr.sort()
  print(maxArr[1])
else:
  print(maxArr[0])
print(arr[-1] - arr[0])