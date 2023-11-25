def solution(numbers, direction):
    answer = []
    if direction == 'right':
        answer.append(numbers.pop())
        for n in numbers:
            answer.append(n)
    else:
        answer = numbers[1:]
        answer.append(numbers[0])
    return answer