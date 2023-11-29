def solution(numbers):
    answer = 0
    i=0
    while i < len(numbers):
        answer *= 10
        if numbers[i] == 'z':
            i+=4
        elif numbers[i] == 'o':
            answer += 1
            i+=3
        elif numbers[i] == 't':
            if numbers[i+1] == 'w':
                i+=3
                answer += 2
            else:
                i+=5
                answer += 3
        elif numbers[i] == 'f':
            if numbers[i+1] == 'o':
                i+=4
                answer+=4
            else:
                i+=4
                answer+=5
        elif numbers[i] == 's':
            if numbers[i+1] == 'i':
                i+=3
                answer+=6
            else:
                i+=5
                answer+=7
        elif numbers[i] == 'e':
            i+=5
            answer+=8
        else:
            i+=4
            answer+=9
    return answer