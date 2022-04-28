package graph.lang;

import java.util.Objects;

public class Arc implements Item {

	private final Node source;
	private final Node target;

	public Arc(Node source, Node target) {
		this.source = source;
		this.target = target;
	}

	public Node getTarget() {
		return target;
	}

	public Node getSource() {
		return source;
	}

	public boolean contains(Node node) {
		return target.equals(node) || source.equals(node);
	}

	@Override
	public int hashCode() {
		return Objects.hash(source, target);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Arc arc = (Arc) obj;
		return this.hashCode() == arc.hashCode();
	}

	@Override
	public String toString() {
		return String.format("{source=%s, target=%s}", source, target);
	}
}
