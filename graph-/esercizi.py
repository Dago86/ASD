dfs(graph G, Node u, boolean[] visitato)
  S.push(u)
    while(!S.isEmpty())
        v = S.pop()
            if(!visitato[u])
                visitato[u] = true
                for each v in G.adj(u)
                    S.push(v)
        
