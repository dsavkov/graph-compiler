import custom.GraphCustomVisitor;
import generated.GraphLexer;
import generated.GraphParser;
import graph.GraphApp;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class Main {

	private static final File SOURCE = Paths.get("src", "main", "resources", "example1.graph").toFile();
	private static final File DESTINATION = Paths.get("src", "main", "java", "graph", "GraphApp.java").toFile();
	private static final String DEST_PACKAGE = "graph";
	private static final String LANG_PACKAGE = "graph.lang";

	public static void main(String[] args) throws IOException {
		writeDestination(graphToJava());
		executeDestination();
	}

	private static String graphToJava() throws IOException {
		var inputStream = new ANTLRFileStream(SOURCE.getAbsolutePath());
		var lexer = new GraphLexer(inputStream);
		var parser = new GraphParser(new CommonTokenStream(lexer));
		var tree = parser.entryPoint();
		var visitor = new GraphCustomVisitor();
		return String.format(
				"package %s;\n\nimport %s.*;\n\n%s",
				DEST_PACKAGE,
				LANG_PACKAGE,
				visitor.visit(tree)
		);
	}

	private static void writeDestination(String str) throws IOException {
		deleteDestinationFile();
		BufferedWriter writer = new BufferedWriter(new FileWriter(DESTINATION));
		writer.write(str);
		writer.close();
	}

	private static void executeDestination() {
		GraphApp.main(null);
	}

	private static void deleteDestinationFile() {
		try {
			if (DESTINATION.delete()) {
				System.out.println(DESTINATION.getName() + " deleted");
			} else {
				System.out.println("failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
