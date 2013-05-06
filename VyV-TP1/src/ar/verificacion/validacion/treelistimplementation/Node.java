package ar.verificacion.validacion.treelistimplementation;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Node implements Serializable{
    
    private static final long serialVersionUID = 5213187274889412089L;

    private int    index;
    
    private Object info;
    
    private Node   left;
    
    private Node   right;
    
    public Node() {
        
    }
    
    public Node(int index, Object info) {
        this.index = index;
        this.info = info;
    }
    
    public Node(Node left, Node right, int index, Object info) {
        this.left = left;
        this.right = right;
        this.index = index;
        this.info = info;
    }
    
    public Node(Object info) {
        this.info = info;
    }
    
    @Override
    public boolean equals(Object that) {
        if (!(that instanceof Node)) {
            return false;
        }
        Node n = (Node) that;
        if ((index != (n.index)) || !info.equals(n.info)) {
            return false;
        }
        boolean b = true;
        if (left == null) {
            b = b && (n.left == null);
        } else {
            b = b && (left.equals(n.left));
        }
        if (right == null) {
            b = b && (n.right == null);
        } else {
            b = b && (right.equals(n.right));
        }
        return b;
    }
    
    public int getIndex() {
        return index;
    }
    
    public Object getInfo() {
        return info;
    }
    
    public Node getLeft() {
        return left;
    }
    
    public Node getRight() {
        return right;
    }
    
    public void setIndex(int index) {
        this.index = index;
    }
    
    public void setInfo(Object info) {
        this.info = info;
    }
    
    public void setLeft(Node left) {
        this.left = left;
    }
    
    public void setRight(Node right) {
        this.right = right;
    }
    
    @Override
    public String toString() {
        Set<Node> visited = new HashSet<Node>();
        visited.add(this);
        return toString(visited);
    }
    
    private String toString(Set<Node> visited) {
        StringBuffer buf = new StringBuffer();
        // buf.append(" ");
        // buf.append(System.identityHashCode(this));
        buf.append(" {");
        if (left != null) {
            if (visited.add(left)) {
                buf.append(left.toString(visited));
            } else {
                buf.append("!tree");
            }
        }
        
        buf.append("(" + index + ", " + info.toString() + ")");
        
        if (right != null) {
            if (visited.add(right)) {
                buf.append(right.toString(visited));
            } else {
                buf.append("!tree");
            }
        }
        buf.append("} ");
        return buf.toString();
    }
    
}
