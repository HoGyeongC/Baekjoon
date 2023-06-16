N = int(input())

arr = [list(map(int, input().split())) for _ in range(N)]

arr = sorted(arr)



for i in range(N):
    print(str(arr[i][0]), str(arr[i][1]))
