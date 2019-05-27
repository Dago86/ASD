/** 
Dato un vettore di n interi, se ne vuole calcolare il massimo. Si scriva lo pseudocodice di un algoritmo divide et impera che partizioni i dati in tre parti bilanciate e richieda
tempo ottimo.
*//

max3(int A[], inizio, fine)
{
  if A[inizio] > A[fine]
     return A[0]
  else if i == j
     return A[i]
  d1 = [(i + (j - i + 1) /3)]
  d2 = [(i + (j - i + 1) * 2/3)]
  return max(max3(A,i,d1 −1),max3(A,d1,d2 −1),ma
  
 }
