Data una lista L di interi, si vuole togliere da L ogni elemento pari e inserirlo in una
nuova lista M, mantenendo in entrambe le liste l’ordine originario degli elementi (p.e. se in
input L = 2, 5, 1, 4, 5, 7, 4, allora in output L = 5, 1, 5, 7 e M = 2, 4, 4). Si scriva lo pseudocodice
di un algoritmo che abbia tempo ottimo utilizzando gli operatori per le liste.


public void Pari(List L)
{
  List M <- List()
  Pos p<- L.head()
  while not L.finished() do
    if L.read(p) mod 2 == 0 then
      M.insert(M.next(M.tail()), L.read(p))
      p <- L.remove(p)
    else
      p <- L.next(p)
 }
      
