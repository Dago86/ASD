"""Dato un albero binario i cui nodi contengono interi, si vuole aggiungere ad ogni foglia un figlio contenente
"""la somma dei valori che appaiono nel cammino dalla radice a tale foglia. Si scriva una procedura ricorsiva di
"""complessita ottima.

pseudocodice:

cercaFiglio(tree t, somma)
  if(t != null)
    somma = somma + t.read()
    if(t.left()=t.right()==null)
        t.insertLeft(t, somma)
    cerca(t.left,somma)
    cerca(t.right, somma)



"""Siano dati un albero binario di ricerca T , in cui ciascun nodo contiene una chiave intera, e dueinteri a e b, con a<b. 
"""Si vuole contare il numero di chiavi di T che appartengono all’intervallochiuso [a,b]. Si scriva algoritmo che utilizza
"""metodi dell’albero e tempo ottimo
      
pseudocode:

CONTA(T, count, a, b)
    if(T != NULL)
        if(a <= T.read <= b) 
            count ++
           CONTA(t.left(),count, a,b)
           CONTA(t.right(),count, a, b)
        if (T.read > b)
            CONTA(t.left(), count, a ,b)
       if(T.read < a)
           CONTA(t.right(),count, a, b)


        
        
Sia dato un intero k e un albero T i cui nodi contiene interi positivi. Si 
vuole aggiungere un figlio destro, che contenga un intero uguale 
quello del padre, nelle foglie per le quali la somma degli interi dalla radice
alla foglia sia uguale a k.


void aggFoglia(T, k, sum)
    if(t != null)
        sum = sum + t.key();
        if(t.left()==null && t.right()==null)
            if (sum == k)
                t.insertRight(t.parent.key())
        else
            aggFoglia(T.left(), k, sum)
            aggFoglia(T.right(), k, sum)
            
            
      """ESERCIZIO: dato un albero calcolare la larghezza massima dei suoi nodi"""     
    """ Questo algoritmo funziona basandosi sui livelli, che permettono di contare azzerando il count quando bisogna farlo"""

def bfs(tree t)
  Queue Q = Queue()
  Q.enqueue(t)
  
  int max = 1  """ larghezza max """
  int level = 1
  int count = 1
  while not Q.isEmpty() do
    Tree u = Q.dequeue()
    if u.level != level then
        level = u.level
        count = 0
    count = count + 1 """ incremento il numero di nodi in quell'altezza"""
    if (count > max) then max = count
    Tree v = u.leftmostChild()
    while v!= nil do
      v.level = u.level + 1
      Q.enqueue(v)
      v = v.rightSibling()
      
      
     """usare array A. es. se A[i] è n  il livello i ha n nodi"""
     
    def larghezza(Tree T, int level)
        A[level] = A[level] + 1
        Tree u = T.leftmostChild()
        while (u != null)
            larghezza(u, level+1)
            u = u.rightSibling()
      
    return A[i] max

      
