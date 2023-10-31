def solution(number, k):
    answer = ''
    numbers = []
    
    t = k
    for i in range(len(number)):
        if len(numbers) == 0:
            numbers.append(number[i])
            continue
        if t == 0:
            for j in range(i, len(number)):
                numbers.append(number[j])
            break
        while len(numbers) > 0 and numbers[-1] < number[i] and t > 0:
            numbers.pop()
            t -= 1
        numbers.append(number[i])
    
    while len(numbers) > len(number) - k:
        numbers.pop()
    
    return ''.join(numbers)