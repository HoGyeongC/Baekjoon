N = int(input())

n_arr = list(map(int, input().split()))

M = int(input())

m_arr = list(map(int, input().split()))

dic = dict()
for i in n_arr:
  if i in dic:
    dic[i] += 1
  else:
    dic[i] = 1

for i in m_arr:
  if i in dic:
    print(dic[i], end=' ')
  else:
    print(0, end = ' ')