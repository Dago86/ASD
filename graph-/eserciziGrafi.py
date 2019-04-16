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
  color[v] = bianco
  foreach u in G.V() - {r} do visitato[u] <- false
        
