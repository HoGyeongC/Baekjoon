import sys
from collections import deque

def differentWord(str1, str2):
    cnt = 0
    for i in range(len(str1)):
        if str1[i] != str2[i]:
            cnt += 1
    if cnt == 1:
        return 1
    return 0

def dfs(begin, target, words):
    que = deque()
    que.append([begin])
    answer = []
    while que:
        arr = que.popleft()
        if arr[len(arr)-1] == target and arr not in answer:
            answer.append(arr)
        for i in range(len(words)):
            s = arr.copy()
            if (words[i] not in s) and differentWord(s[len(s)-1], words[i]) == 1:
                s.append(words[i])
                que.append(s)
                print(s)
    return answer

def solution(begin, target, words):
    answer = dfs(begin, target, words)

    if target not in words:
        return 0
    
    if len(answer) == 0:
        return 0

    min = len(answer[0])
    for s in answer:
        if min > len(s):
            min = len(s)
    return min - 1