Dato un albero binario, i cui nodi contengono elementi interi, si scriva una procedura di complessita ottima `
per ottenere l’albero inverso, ovvero un albero in cui il figlio destro (con relativo sottoalbero) e scambiato `
con il figlio sinistro (con relativo sottoalbero).

Pseudocodice:

inverti(tree t)
 if (t != null)
  if(t.right()=t.left()!= null)
    swap(t.right(), t.left())
  inverti(t.right())
  inverti(t.left())
