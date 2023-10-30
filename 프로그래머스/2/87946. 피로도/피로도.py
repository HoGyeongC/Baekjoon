from itertools import permutations
def solution(k, dungeons):
    answer = -1
    
    dungeonsPermutation = list(permutations(dungeons, len(dungeons)))

    max = 0
    for i in range(len(dungeonsPermutation)):
        kk = k
        cnt = 0
        for j in range(len(dungeonsPermutation[i])):
            if kk < dungeonsPermutation[i][j][0]:
                break
            kk -= dungeonsPermutation[i][j][1]
            cnt += 1
        if max < cnt:
            max = cnt
        if max == len(dungeonsPermutation[i]):
            return max
            
            
    
    return max