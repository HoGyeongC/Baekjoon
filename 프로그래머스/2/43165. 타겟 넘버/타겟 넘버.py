def targetNumber(numbers, target, depth):
    cnt = 0
    if len(numbers) == depth:
        if sum(numbers) == target:
            return 1
        return 0
    else:
        cnt += targetNumber(numbers, target, depth+1)
        numbers[depth] *= -1
        cnt += targetNumber(numbers, target, depth+1)
        return cnt


def solution(numbers, target):
    answer = targetNumber(numbers, target, 0)
    return answer