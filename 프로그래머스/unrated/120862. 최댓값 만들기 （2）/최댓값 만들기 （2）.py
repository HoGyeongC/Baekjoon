def solution(numbers):
    answer = 0
    Max = numbers[0] * numbers[1]
    
    for i in range(len(numbers)):
        for j in range(len(numbers)):
            if i != j and numbers[i] * numbers[j] > Max:
                Max = numbers[i] * numbers[j]
    
    return Max