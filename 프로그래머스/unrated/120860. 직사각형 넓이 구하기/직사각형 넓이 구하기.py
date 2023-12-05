def solution(dots):
    answer = 1
    dotx1 = dots[0][0]
    doty1 = dots[0][1]
    dotx2 = 0
    doty2 = 0
    for do in dots:
        if do[0] != dotx1:
            dotx2 = do[0]
        if do[1] != doty1:
            doty2 = do[1]
    answer *= (dotx1-dotx2)
    answer *= (doty1-doty2)
    if answer < 0:
        answer *= -1
    return answer