def solution(brown, yellow):
    answer = []
    
    totalSize = brown + yellow
    i = 1
    width = 0
    height = 0
    while i <= totalSize:
        if float.is_integer(totalSize / i):
            width = totalSize // i
            height = i
            if (width-2) * (height-2) == yellow:
                break
        i += 1
    
    answer.append(width)
    answer.append(height)
    
    return answer