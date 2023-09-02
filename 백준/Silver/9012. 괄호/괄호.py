def isVPS(line):
  
  cnt = 0
  for i in line:
    if cnt < 0:
      return "NO"
    if i == '(':
      cnt+=1
    elif i == ')':
      cnt-=1
  
  if cnt != 0:
    return "NO"
  else:
    return "YES"


N = int(input())

VPS = []

for i in range(N):
  line = input()
  VPS.append(line)

for line in VPS:
  print(isVPS(line))
  


# print()
# for i in range(N):
#   print(VPS[i])

