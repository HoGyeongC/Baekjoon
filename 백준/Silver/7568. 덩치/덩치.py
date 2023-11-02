def isBig(A, B):
  if A[0] > B[0] and A[1] > B[1]:
    return 1
  if A[0] < B[0] and A[1] < B[1]:
    return 2
  return 0

N = int(input())
people = []
for _ in range(N):
  people.append(list(map(int, input().split())))

for i in range(N):
  rank = 1
  for j in range(N):
    if isBig(people[i], people[j]) == 2:
      rank += 1
  print(rank, end=' ')