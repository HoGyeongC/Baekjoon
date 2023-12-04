def solution(array):
    answer = 0
    for arr in array:
        while arr > 0:
            if arr % 10 == 7:
                answer += 1
            arr = arr // 10
    return answer