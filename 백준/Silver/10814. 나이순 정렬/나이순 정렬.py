N = int(input())

users = []

for _ in range(N):
  user = input().split()
  user[0] = int(user[0])
  users.append(user)

users.sort(key = lambda x:x[0])

for i in users:
  print(i[0],i[1])