def solution(survey, choices):
    RCJA = [0,0,0,0]
    for i in range(len(survey)):
        if survey[i] == "RT":
            if choices[i] > 4:
                RCJA[0] -= choices[i] -4
            elif choices[i] < 4:
                RCJA[0] += 4 - choices[i]
        elif survey[i] == "TR":
            if choices[i] > 4:
                RCJA[0] += choices[i] -4
            elif choices[i] < 4:
                RCJA[0] -= 4 - choices[i]
        elif survey[i] == "CF":
            if choices[i] > 4:
                RCJA[1] -= choices[i] -4
            elif choices[i] < 4:
                RCJA[1] += 4 - choices[i]
        elif survey[i] == "FC":
            if choices[i] > 4:
                RCJA[1] += choices[i] -4
            elif choices[i] < 4:
                RCJA[1] -= 4 - choices[i]
        elif survey[i] == "JM":
            if choices[i] > 4:
                RCJA[2] -= choices[i] -4
            elif choices[i] < 4:
                RCJA[2] += 4 - choices[i]
        elif survey[i] == "MJ":
            if choices[i] > 4:
                RCJA[2] += choices[i] -4
            elif choices[i] < 4:
                RCJA[2] -= 4 - choices[i]
        elif survey[i] == "AN":
            if choices[i] > 4:
                RCJA[3] -= choices[i] -4
            elif choices[i] < 4:
                RCJA[3] += 4 - choices[i]
        elif survey[i] == "NA":
            if choices[i] > 4:
                RCJA[3] += choices[i] -4
            elif choices[i] < 4:
                RCJA[3] -= 4 - choices[i]
    
    answer = ""
    if RCJA[0]>=0:
        answer += "R"
    else:
        answer += "T"
    if RCJA[1]>=0:
        answer += "C"
    else:
        answer += "F"
    if RCJA[2]>=0:
        answer += "J"
    else:
        answer += "M"
    if RCJA[3]>=0:
        answer += "A"
    else:
        answer += "N"
    
    return answer