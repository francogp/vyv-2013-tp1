package treelist;

import java.util.HashSet;
import java.util.Set;

public class Node {

	private Node left;

	private Node right;

	private int index;

	private Object info;

	Node(Node left, Node right, int index, Object info) {
		this.left = left;
		this.right = right;
		this.index = index;
		this.info = info;
	}

	Node(int index, Object info) {
		this.index = index;
		this.info = info;
	}

	Node(Object info) {
		this.info = info;
	}

	public Node() {

	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public void setInfo(Object info) {
		this.info = info;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Node getLeft() {
		return this.left;
	}

	public Node getRight() {
		return this.right;
	}

	public int getIndex() {
		return this.index;
	}

	public Object getInfo() {
		return this.info;
	}

	public String toString() {
		Set<Node> visited = new HashSet<>();
		visited.add(this);
		return toString(visited);
	}

	private String toString(Set<Node> visited) {
		StringBuffer buf = new StringBuffer();
		// buf.append(" ");
		// buf.append(System.identityHashCode(this));
		buf.append(" {");
		if (left != null)
			if (visited.add(left))
				buf.append(left.toString(visited));
			else
				buf.append("!tree");

		buf.append("(" + this.index + ", " + this.info.toString() + ")");

		if (right != null)
			if (visited.add(right))
				buf.append(right.toString(visited));
			else
				buf.append("!tree");
		buf.append("} ");
		return buf.toString();
	}

	public boolean equals(Object that) {
		if (!(that instanceof Node))
			return false;
		Node n = (Node) that;
		if (this.index != (n.index) || !this.info.equals(n.info))
			return false;
		boolean b = true;
		if (left == null)
			b = b && (n.left == null);
		else
			b = b && (left.equals(n.left));
		if (right == null)
			b = b && (n.right == null);
		else
			b = b && (right.equals(n.right));
		return b;
	}

}
