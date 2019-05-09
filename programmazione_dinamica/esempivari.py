''' Presente nelle videolezioni di Montresor; calcolare il sottoinsieme piu grande ma tenendo conto che non possiamo prendere i unito i-1 unito i-2'''
def hateville(D):
    DP = [0, D[0]]
    for i in range(1, len(D)):
        DP.append(max(DP[-1], DP[-2] + D[i]))
    return DP[-1]


'''Knapsack approccio ricorsivo'''
def knapsack(w,p,C):
    n= len(w)
    DP = [[-1]*(C+1) for i in range (n+1)]
    return knapsackrec(w,p,n,C, DP)

def knapsackrec(w,p,i,c,DP):
    if c<0:
        return -math.inf
    elif i== 0 or c==0:
        return 0
    else:
        if DP[i][c] < 0:
            nottaken = knapsackrec(w,p,i-1,c, DP)
            taken = knapsackrec(w,p,i-1,c-w[i-1],DP) + p[i-1]
            DP[i][c]= max(nottaken, taken)
        return DP[i][c]
    
    
    '''Knapsack, approccio con memoization e ricorsione'''
    def knapsack(w,p,C):
    n= len(w)
    DP ={} '''si utilizza un dizionario'''
    return knapsackrec(w,p,n,C, DP)


    def knapsackrec(w,p,i,c,DP):
    if c<0:
        return -math.inf
    elif i== 0 or c==0:
        return 0
    else:
        if not(i,c) in DP:
            nottaken = knapsackrec(w,p,i-1,c, DP)
            taken = knapsackrec(w,p,i-1,c-w[i-1],DP) + p[i-1]
            DP[i][c]= max(nottaken, taken)
        return DP[i][c]
