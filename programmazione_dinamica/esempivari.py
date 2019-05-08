''' Presente nelle videolezioni di Montresor; calcolare il sottoinsieme piu grande ma tenendo conto che non possiamo prendere i unito i-1 unito i-2'''
def hateville(D):
    DP = [0, D[0]]
    for i in range(1, len(D)):
        DP.append(max(DP[-1], DP[-2] + D[i]))
    return DP[-1]
