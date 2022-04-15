package custom;

public class IndentProvider {

	private Integer currentIndentLevel = 0;
	private final String indentSymbol;

	public IndentProvider(String indentSymbol) {
		this.indentSymbol = indentSymbol;
	}

	public void next() {
		currentIndentLevel++;
	}

	public void prev() {
		currentIndentLevel--;
	}

	public String getIndent() {
		return indentSymbol.repeat(Math.max(0, currentIndentLevel));
	}
}
