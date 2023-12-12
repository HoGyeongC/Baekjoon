def solution(sides):
    answer = 0
    for i in range(1,max(sides)):
        if i + min(sides) > max(sides):
            answer += 1
            print(i)
    print()
    i = max(sides)
    while True:
        if sum(sides) > i:
            answer += 1
            i += 1
        else:
            break
        print(i)
    return answer