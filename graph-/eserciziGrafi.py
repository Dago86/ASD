dfs(graph G, Node u, boolean[] visitato)
  S.push(u)
    while(not S.isEmpty())
        v = S.pop()
            if(not visitato[u])
                visitato[u] = true
                for each v in G.adj(u)
                    S.push(v)
        
