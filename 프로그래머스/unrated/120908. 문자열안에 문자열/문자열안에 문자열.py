def solution(str1, str2):
    flag = 1
    for i in range(len(str1)):
        if str2[0] == str1[i]:
            j=0
            flag = 0
            while j+i<len(str1) and j < len(str2):
                if str1[j+i] != str2[j]:
                    flag = 1
                    break
                j+=1
        if flag == 0 and j == len(str2):
            return 1
    return 2