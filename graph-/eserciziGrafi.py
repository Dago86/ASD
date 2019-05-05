""" Esercizio 9.2 libro. DFS iterativa """
dfs(graph G, Node u, boolean[] visitato)
  S.push(u)
    while(not S.isEmpty())
        v = S.pop()
            if(not visitato[u])
                visitato[u] = true
                for each v in G.adj(u)
                    S.push(v)
              
             
            
"""Esercizio 9.4. Fare un algoritmo in grado di riconoscere un grafo bipartito.
IDEA: uso la bfs, ma aggiungo un vettore che contiene, per ogni nodo, un colore (due colori). Alla fine scorro 
il vettore e non devo avere due colori uguali di seguito """

bfsColor(Graph G, Node r)
  Queue S <- Queue()
  colori[] color <- new colori[1...G.n]
  S.enqueue(r)
  foreach u in G.V() - {r} do visitato[u] <- null
  color[v] = bianco
  while not S.isEmpty() do
    Node u <- S.dequeue()
     foreach v in G.adj(u) do
       if color[v] = null
          if v%2 == 0 then color[v] = rosso
          else color[v] = bianco
          S.enqueue()
  verificaBipartizione(colori[])
  
  
verificaBipartizione(colori[]) """ metodo che controlla che i e i+1 abbiano un colore diverso, se hanno colori uguali allora non è bipartito"""
    
"""ESERCIZIO: Dato un grafo restituire il nodo con il numero piu alto di vicini"""

"""La mia soluzione si basa su un array di n elementi quanto sono i nodi del grafo, e per ogni cella inserisco il numero di archi"""
def visit(graph G)
int [] Vettore = new int (1... G.n)
int i = 0
foreach u in G.V() do
i ++
  foreach v in G.adj(u) do
  A[i] ++

return max A[i]


"""soluzione ufficiale"""
def visit(graph G)
  int [] Vettore = new int (1... G.n)
  foreach u in G.V() do
    for v in G.adj(u) do
      Vettore[u] ++
return max(Vettore[])
