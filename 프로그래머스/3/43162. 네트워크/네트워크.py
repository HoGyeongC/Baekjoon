def dfs(m, computers, network):
    stk = []
    stk.append(m)
    n = len(computers)
    while stk:
        k = stk.pop()
        for i in range(n):
            if k == i:
                continue
            if computers[k][i] == 1 and network[i] == 0:
                stk.append(i)
                network[i] = 2


def solution(n, computers):
    answer=0
    network = [0 for _ in range(n)]
    for i in range(n):
        if network[i] == 0:
            network[i] =1
            dfs(i,computers,network)
    return network.count(1)