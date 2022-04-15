import custom.GraphCustomVisitor;
import generated.GraphLexer;
import generated.GraphParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.AfterEach;
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
	private static final List<String> EXAMPLE_FILES = new ArrayList<>();

	@BeforeAll
	static void beforeAll() {
		for (File file : Objects.requireNonNull(RESOURCES_FOLDER.listFiles())) {
			if (!file.isDirectory()) {
				EXAMPLE_FILES.add(file.getAbsolutePath());
			}
		}
	}

	@AfterEach
	void afterEach() {
		System.out.println();
	}

	@Test
	void testSample1() throws IOException {
		var inputStream = new ANTLRFileStream(EXAMPLE_FILES.get(0));
		var lexer = new GraphLexer(inputStream);
		var parser = new GraphParser(new CommonTokenStream(lexer));
		var tree = parser.compilationUnit();
		var visitor = new GraphCustomVisitor();
		System.out.println(visitor.visit(tree));
	}

	@Test
	void testSample2() throws IOException {
		var inputStream = new ANTLRFileStream(EXAMPLE_FILES.get(1));
		var lexer = new GraphLexer(inputStream);
		var parser = new GraphParser(new CommonTokenStream(lexer));
		var tree = parser.compilationUnit();
		var visitor = new GraphCustomVisitor();
		System.out.println(visitor.visit(tree));
	}

	@Test
	void testSample3() throws IOException {
		var inputStream = new ANTLRFileStream(EXAMPLE_FILES.get(2));
		var lexer = new GraphLexer(inputStream);
		var parser = new GraphParser(new CommonTokenStream(lexer));
		var tree = parser.compilationUnit();
		var visitor = new GraphCustomVisitor();
		System.out.println(visitor.visit(tree));
	}
}
