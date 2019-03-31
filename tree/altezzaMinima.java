Dato un albero binario T, definiamo altezza minimale di un nodo v la minima distanza di v da una delle
foglie del suo sottoalbero.
• Descrivere un algoritmo che riceve in input un nodo v e restituisce la sua altezza minimale.
• Calcolare la complessita in tempo dell’algoritmo proposto.

pseudocodice:


int minimo(v, altezza, altezzaMin)
    if (altezza < altezzaMin) then altezzaMin = altezza
    if(t==null)
        return altezzaMin
    if(t.left() == t.right() != null)
        altezza = 1 + minimo(t.left(), altezza, altezzaMin)
        altezza = 1 + minimo(t.right()altezza, altezzaMin)
    else if (t.left() != null and t.right == null)
        altezza = 1 + minimo(t.left())
    else if (t.right() ! null and t.left == null)
        altezza = 1 + minimo(t.right()altezza, altezzaMin)
