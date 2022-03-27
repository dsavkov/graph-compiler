import custom.GraphCustomVisitor;
import generated.GraphLexer;
import generated.GraphParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CodeSamplesParserTest {

	private static final File RESOURCES_FOLDER = Paths.get("src", "test", "resources").toFile();
	private static List<String> exampleFiles;

	@BeforeAll
	static void beforeAll() {
		exampleFiles = getExampleFiles();
	}

	@Test
	void testSample1() throws IOException {
		var inputStream = new ANTLRFileStream(exampleFiles.get(0));
		var lexer = new GraphLexer(inputStream);
		var parser = new GraphParser(new CommonTokenStream(lexer));
		var tree = parser.compilationUnit();
		var visitor = new GraphCustomVisitor();
		var output = visitor.visit(tree);
	}

	@Test
	void testSample2() throws IOException {
		var inputStream = new ANTLRFileStream(exampleFiles.get(1));
		var lexer = new GraphLexer(inputStream);
		var parser = new GraphParser(new CommonTokenStream(lexer));
		var tree = parser.compilationUnit();
		var visitor = new GraphCustomVisitor();
		var output = visitor.visit(tree);
	}

	@Test
	void testSample3() throws IOException {
		var inputStream = new ANTLRFileStream(exampleFiles.get(2));
		var lexer = new GraphLexer(inputStream);
		var parser = new GraphParser(new CommonTokenStream(lexer));
		var tree = parser.compilationUnit();
		var visitor = new GraphCustomVisitor();
		var output = visitor.visit(tree);
	}

	private static List<String> getExampleFiles() {
		List<String> result = new ArrayList<>();
		for (File file : Objects.requireNonNull(RESOURCES_FOLDER.listFiles())) {
			if (!file.isDirectory()) {
				result.add(file.getAbsolutePath());
			}
		}
		return result;
	}
}
