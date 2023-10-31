def solution(number, k):
    answer = ''
    numbers = []
    
    for i in range(len(number)):
        if len(numbers) == 0:
            numbers.append(number[i])
            continue
        if k == 0:
            for j in range(i, len(number)):
                numbers.append(number[j])
            break
        while len(numbers) > 0 and numbers[-1] < number[i] and k > 0:
            numbers.pop()
            k -= 1
        numbers.append(number[i])
    
    if k != 0:
        numbers = numbers[:-k]
    
    return ''.join(numbers)