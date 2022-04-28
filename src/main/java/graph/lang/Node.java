package graph.lang;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Node extends Graph implements Item, Comparable<Node> {

	private final int x;
	private final int y;

	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public int getX() {
		return x;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Node node = (Node) obj;
		return this.hashCode() == node.hashCode();
	}

	@Override
	public List<Node> getNodes() {
		return List.of(this);
	}

	@Override
	public List<Arc> getArcs() {
		return Collections.emptyList();
	}

	@Override
	public Node getNode(int index) {
		if (index > 0) throw new  IllegalArgumentException();
		else return this;
	}

	@Override
	public int size() {
		return 1;
	}

	@Override
	public Graph add(Node node) {
		return new Graph(this, node);
	}

	@Override
	public Graph add(Arc arc) {
		return new Graph(this, arc);
	}

	@Override
	public Graph sub(Node node) {
		if (node.equals(this)) return new Graph();
		else return this;
	}

	@Override
	public Graph sub(Arc arc) {
		if (arc.contains(this)) return new Graph();
		else return this;
	}

	@Override
	public Graph mul(Graph graph) {
		if (graph.getNodes().contains(this)) return this;
		else return new Graph();
	}

	@Override
	public String toString() {
		return String.format("{x=%s, y=%s}", x, y);
	}

	@Override
	public int compareTo(Node o) {
		int xCompare = Integer.compare(x, o.x);
		if (xCompare != 0) {
			return xCompare;
		} else {
			return Integer.compare(y, o.y);
		}
	}
}
