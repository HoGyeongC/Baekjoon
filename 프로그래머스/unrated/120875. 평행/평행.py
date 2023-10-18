import math
def solution(dots):
    answer = 0
    
    if slope(dots[0],dots[1]) == slope(dots[2],dots[3]):
        answer = 1
    if slope(dots[0],dots[2]) == slope(dots[1],dots[3]):
        answer = 1
    if slope(dots[0],dots[3]) == slope(dots[1],dots[2]):
        answer = 1

    return answer

def slope(a,b):
    return (a[1]-b[1])/(a[0]-b[0])