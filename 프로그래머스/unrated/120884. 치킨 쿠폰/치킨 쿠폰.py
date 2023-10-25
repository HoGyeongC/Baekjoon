def solution(chicken):
    answer = 0
    coupon = 0
    service = 0
    
    while chicken >= 10:
        coupon = chicken % 10
        service = (int)(chicken / 10)
        answer += service
        chicken = service + coupon
        
    
    return answer