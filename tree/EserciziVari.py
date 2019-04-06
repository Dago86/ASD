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
