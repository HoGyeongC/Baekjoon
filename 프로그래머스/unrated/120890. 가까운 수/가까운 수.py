def solution(array, n):
    des = max(array[0] - n, n - array[0])
    answer = array[0]
    for arr in array:
        tmp = max(arr-n,n-arr)
        if des > tmp:
            des = tmp
            answer = arr
        elif des == tmp:
            answer = min(answer,arr)
    
    return answer