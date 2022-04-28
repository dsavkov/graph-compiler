package graph.lang;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Graph {

	private final Set<Node> nodes = new HashSet<>();
	private final Set<Arc> arcs = new HashSet<>();

	public Graph() {
	}

	public Graph(Collection<? extends Node> nodes, Collection<? extends Arc> arcs) {
		this.arcs.addAll(arcs);
		this.nodes.addAll(arcs.stream()
				.flatMap(e -> Stream.of(e.getSource(), e.getTarget()))
				.collect(Collectors.toSet()));
		this.nodes.addAll(nodes);
	}

	public Graph(Item... items) {
		Arrays.stream(items).forEach(item -> {
			if (item instanceof Node node) {
				this.nodes.add(node);
			} else if (item instanceof Arc arc) {
				this.arcs.add(arc);
				this.nodes.addAll(Set.of(arc.getSource(), arc.getTarget()));
			}
		});
	}

	public List<Node> getNodes() {
		return nodes.stream().sorted().toList();
	}

	public List<Arc> getArcs() {
		return arcs.stream().toList();
	}

	public Node getNode(int index) {
		return getNodes().get(index);
	}

	public int size() {
		return nodes.size();
	}

	public Graph add(Node node) {
		this.nodes.add(node);
		return this;
	}

	public Graph add(Arc arc) {
		this.arcs.add(arc);
		this.nodes.addAll(Set.of(arc.getSource(), arc.getTarget()));
		return this;
	}

	public Graph sub(Node node) {
		this.nodes.remove(node);
		return this;
	}

	public Graph sub(Arc arc) {
		this.arcs.remove(arc);
		return this;
	}

	public Graph mul(Graph graph) {
		return new Graph(
				nodes.stream()
						.distinct()
						.filter(graph.getNodes()::contains)
						.collect(Collectors.toSet()),
				arcs.stream()
						.distinct()
						.filter(graph.getArcs()::contains)
						.collect(Collectors.toSet())
		);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{nodes=[");
		for (Node node : getNodes()) {
			builder.append(node);
			builder.append(", ");
		}
		if (!nodes.isEmpty()) {
			builder.deleteCharAt(builder.length() - 1);
			builder.deleteCharAt(builder.length() - 1);
		}
		builder.append("], arcs=[");
		for (Arc arc : getArcs()) {
			builder.append(arc);
			builder.append(", ");
		}
		if (!arcs.isEmpty()) {
			builder.deleteCharAt(builder.length() - 1);
			builder.deleteCharAt(builder.length() - 1);
		}
		builder.append("]}");
		return builder.toString();
	}
}
