Dato un albero binario i cui nodi contengono interi, si vuole aggiungere ad ogni foglia un figlio contenente
la somma dei valori che appaiono nel cammino dalla radice a tale foglia. Si scriva una procedura ricorsiva di
complessita ottima.

pseudocodice:

cercaFiglio(tree t, somma)
  if(t != null)
    somma = somma + t.read()
    if(t.left()=t.right()==null)
        t.insertLeft(t, somma)
    cerca(t.left,somma)
    cerca(t.right, somma)
