import sys

N = int(sys.stdin.readline())
inputNum = []
for _ in range(N):
  inputNum.append(int(sys.stdin.readline()))
numArr = [i+1 for i in range(N)]
st = []
result = []
answer = []
i = 0
j = 0
while j < len(numArr):
  if len(st)== 0 or st[-1] != inputNum[i]:
    st.append(numArr[j])
    answer.append("+")
    j += 1
  elif st[-1] == inputNum[i]:
      result.append(st.pop())
      answer.append("-")
      i+=1

while st:
  result.append(st.pop())
  answer.append("-")

if result == inputNum:
  for i in range(len(answer)):
    print(answer[i])
else:
  print("NO")