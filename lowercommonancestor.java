Node lca(Node root, node n1, node n2)
{
 if (root == null) return null
 if (root == n1 ) && (root == n2) return root
 
 Node left = (root.left(), n1, n2)
 Node right = (root.right(), n1, n2)
 
  if (left != null && right !== null) return root
  if ( left == null %% right == null) return null
  
  return left != null ? left: right
 }
