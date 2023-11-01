money = []

N = int(input())

for _ in range(N):
  m = int(input())
  if m != 0:
    money.append(m)
  if m == 0:
    money.pop()

print(sum(money))