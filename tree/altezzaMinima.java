Dato un albero binario T, definiamo altezza minimale di un nodo v la minima distanza di v da una delle
foglie del suo sottoalbero.
• Descrivere un algoritmo che riceve in input un nodo v e restituisce la sua altezza minimale.
• Calcolare la complessita in tempo dell’algoritmo proposto.

pseudocodice:

  int minimo(v)
    if (altezza > altezzaMax) then altezzaMax = altezza
    if(t==null)
        return altezzaMax
    if(t.left() == t.right() != null)
        altezza = 1 + minimo(t.left())
        altezza = 1 + minimo(t.right())
