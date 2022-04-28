package graph;

import graph.lang.*;

public class GraphApp {

	public static void main(String[] args) {
		Graph initial = (Graph) new Node(1, 1);
		Graph g = initial;
		Node n1 = g.getNode(0);
		System.out.println(g.size());
		g = g.add(new Node(2, 2));
		Node n2 = g.getNode(1);
		System.out.println(g.size());
		g = g.add(new Arc(n1, n2));
		System.out.println(g.size());
		g = g.sub(n1);
		System.out.println(g.size());
		System.out.println(initial == g);
	}

}