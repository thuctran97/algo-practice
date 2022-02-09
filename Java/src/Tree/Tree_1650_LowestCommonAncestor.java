package Tree;

import java.util.HashSet;

class Node2 {
    public int val;
    public Node left;
    public Node right;
    public Node2 parent;
};

public class Tree_1650_LowestCommonAncestor {
    public Node2 lowestCommonAncestor(Node2 p, Node2 q) {
        if(p == null || q == null) return null;

        HashSet<Node2> ansestors = new HashSet<Node2>();

        while(p != null) {
            ansestors.add(p);
            p = p.parent;
        }

        while(!ansestors.contains(q)) {
            q = q.parent;
        }

        return q;
    }
}
