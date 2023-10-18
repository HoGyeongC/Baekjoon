def solution(babbling):
    answer = 0
    
    list = ["aya", "ye", "woo", "ma"]
    
    for babble in babbling:
        for a in list:
            if a in babble:
                babble = babble.replace(a,' ')
        babble = babble.replace(' ','')
        if len(babble) == 0:
            answer +=1
        
    
    return answer