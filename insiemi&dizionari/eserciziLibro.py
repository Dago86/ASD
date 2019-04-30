8.1. Intersezione di liste non ordinate costo O(nm) ?? dove n = A e m = B

def set intersection(Set A, Set B)
  Set C <- Set()
  Pos p <- A.head()
  pos r- > C.head()
  while not A.finished(p) do
    if B.contains(A.read(p)) then
      C.insert(A.read(p),r)
    p <- A.next(p)
  return C
  
  
 8.2 Unione di liste non ordinate
 
def set union(Set A, Set B)
  Set C <- Set()
  pos p <- A.head()
  pos q <- B.head()
  pos r <- C.head()
  while not B.finished(q) do
    C.insert(B.read(q), r)
    q <- B.next(q)
  while not A.finished(p) do
    if not B.contains(A.read(p) then
      C.insert(A.read(p),r)
     p<- A.next(p)
  return C
