def solution(sizes):
    
    maxW = 0
    maxH = 0
    
    for i in sizes:
        i.sort()
        if maxW < i[0]:
            maxW = i[0]
        if maxH < i[1]:
            maxH = i[1]
    
    
    
    
    return maxW * maxH