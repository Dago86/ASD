Dato un albero binario T, definiamo altezza minimale di un nodo v la minima distanza di v da una delle
foglie del suo sottoalbero.
• Descrivere un algoritmo che riceve in input un nodo v e restituisce la sua altezza minimale.
• Calcolare la complessita in tempo dell’algoritmo proposto.

pseudocodice:

int minimo(v)
{
    if (t == null) return 0
    if (t.left()=t.right()==null) return 1
    if(t.left() == null)) return minimo(t.right()) + 1
    if (t.lright() == null)) return minimo(t.left())+1
                                           
    return min (minimo(t.left())+minimo(t.right())+1=
}
