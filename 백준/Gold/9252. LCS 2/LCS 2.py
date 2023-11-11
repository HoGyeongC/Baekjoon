import sys

str1 = " " + sys.stdin.readline().rstrip()
str2 = " " + sys.stdin.readline().rstrip()
l1 = len(str1)
l2 = len(str2)
dp = [["" for _ in range(l2)] for _ in range(l1)]
for i in range(1, l1):
  for j in range(1, l2):
    if str1[i] == str2[j]:
      dp[i][j] = dp[i-1][j-1] + str1[i]
    else:
      if len(dp[i-1][j]) > len(dp[i][j-1]):
        dp[i][j] = dp[i-1][j]
      else:
        dp[i][j] = dp[i][j-1]

result = dp[-1][-1]
print(len(result))
if len(result) != 0:
  print(result)