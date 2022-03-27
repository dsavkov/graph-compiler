rm -r src/main/java/generated
cd src/main/antlr/
java -Xmx500M -cp "/usr/local/lib/antlr-4.9-complete.jar:$CLASSPATH" org.antlr.v4.Tool Graph.g4 -visitor -package generated -o ../java/generated
