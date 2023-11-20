def solution(numer1, denom1, numer2, denom2):
    answer = []
    if denom1 != denom2:
        denom = denom1
        numer1 *= denom2
        denom1 *= denom2
        numer2 *= denom
        denom2 *= denom
    resultNumer = numer1 + numer2
    resultDenom = denom1
    
    n = min(resultNumer, resultDenom)
    for i in range(n,1, -1):
        if resultNumer % i == 0 and resultDenom % i == 0:
            resultNumer = resultNumer // i
            resultDenom = resultDenom // i
    
    answer.append(resultNumer)
    answer.append(resultDenom)
    
    
    return answer