/**Data una lista L di interi, si vuole togliere da L ogni elemento pari e inserirlo in una
nuova lista M, mantenendo in entrambe le liste l’ordine originario degli elementi (p.e. se in
input L = 2, 5, 1, 4, 5, 7, 4, allora in output L = 5, 1, 5, 7 e M = 2, 4, 4). Si scriva lo pseudocodice
di un algoritmo che abbia tempo ottimo utilizzando gli operatori per le liste.*//


public void Pari(List L)
{
  List M <- List()
  Pos p<- L.head()
  while not L.finished(p) do
    if L.read(p) mod 2 == 0 then
      M.insert(M.next(M.tail()), L.read(p))
      p <- L.remove(p)
    else
      p <- L.next(p)
 }
      

/**Data una lista L di interi, si vuole togliere da L tutti gli elementi che compaiono solo una volta e inserirli in un'altra lista M, 
  mantenendo l'ordine originale.*//
    
 rem_duplicates(List L, List m)
  {
    Pos p <- L.head()
    int n = 0;
    while not L.finished(p) do
      n ++ 
      p <- L.next(p)
    Hash H <- Hash(2n)
    p <- L.head()
    while not L.finished(p) do
      integer l <- L.read(p)
      integer c <- H.lookup(l)
      if c == nill then
        H.insert(l,1)
      else
        H.insert(l,c+1)
      p <- L.next(p)
    
    p<- L.head(p)
    while not L.finished(p) do
      int c <- H.lookup(l)
      if c == 1 then
        M.insert(M.tail(),l)
        L.remove(p)
      else 
        p <- L.next(p)
      }
