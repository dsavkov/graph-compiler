grammar Graph;

// 1. Literals
NUMBER : [0-9] | [1-9]+[0-9];
LINE : '"'(.)+?'"';

// 2. Keywords
MAIN : 'main';
VOID : 'void';
IF : 'if';
THEN : 'then';
ELSE : 'else';
FOR : 'for';
WHILE : 'while';
UNTIL : 'until';
RETURN : 'return';
GLOBAL : 'global';

// 2.1 Built-in types
INT : 'int';
NODE : 'node';
ARC : 'arc';
GRAPH : 'graph';

primitiveType
    :   INT
    |   NODE
    |   ARC
    |   GRAPH
    ;

// 2.2 Built-in functions
PRINTLN : 'println';
SIZE : 'size';
GET : 'get';

// 3. Separators
OPEN_BRACKET : '(';
CLOSE_BRACKET : ')';
OPEN_CURLY_BRACKET : '{';
CLOSE_CURLY_BRACKET : '}';
SEMIOCOLON : ';';
COMMA : ',';
DOT : '.';

// 4. Operators
ASSIGN : '=';
GREATER : '>';
LESS : '<';
EQUAL : '==';
LESS_OR_EQUAL : '<=';
GREATER_OR_EQUAL : '>=';
NOT_EQUAL : '!=';
AND : '&&';
OR : '||';
INCREMENT : '++';
DECREMENT : '--';
ADD : '+';
SUB : '-';
MULTIPLY : '*';
DIVIDE : '/';
IN : 'in';

comparisonOperator
    :   LESS_OR_EQUAL
    |   GREATER_OR_EQUAL
    |   LESS
    |   GREATER
    |   EQUAL
    |   NOT_EQUAL
    ;

mathOperator
    :   ADD
    |   SUB
    |   MULTIPLY
    |   DIVIDE
    ;

logicalOperator
    :   OR
    |   AND
    ;

// 5. Statements and blocks
entryPoint
    :   globalVariableDeclarationStatement* methodDeclaration* mainMethodDeclaration EOF
    ;

mainMethodDeclaration
    :   VOID MAIN OPEN_BRACKET CLOSE_BRACKET methodBody
    ;

methodDeclaration
    :   (primitiveType | VOID) Identifier methodParameters methodBody
    ;

methodParameters
    :   OPEN_BRACKET methodParameterDecls? CLOSE_BRACKET
    ;

methodParameterDecls
    :   primitiveType methodParameterDeclsRest
    ;

methodParameterDeclsRest
    :   Identifier (COMMA methodParameterDecls)?
    ;

methodBody
    :   block
    ;

block
    :   OPEN_CURLY_BRACKET blockStatement* CLOSE_CURLY_BRACKET
    ;

blockStatement
    :   statement
    |   localVariableDeclarationStatement
    ;

statement
    :	block
    |   ifStatement
    |   forStatement
    |   whileStatement
    |   untilStatement
    |   returnStatement
    |   methodCallStatement
    |   expressionStatement
    ;

expressionStatement
    :   expression SEMIOCOLON
    ;

methodCallStatement
    :   methodCallExpression SEMIOCOLON
    ;

returnStatement
    :   RETURN expression SEMIOCOLON
    ;

ifStatement
    :   IF parExpression THEN statement (ELSE statement)?
    ;

whileStatement
    :   WHILE parExpression statement
    ;

untilStatement
    :   UNTIL parExpression statement
    ;

forStatement
    :   FOR OPEN_BRACKET forControl CLOSE_BRACKET statement
    ;

forControl
    :   primitiveType Identifier IN expression
    ;

globalVariableDeclarationStatement
    :   globalVariableDeclaration SEMIOCOLON
    ;

globalVariableDeclaration
    :   GLOBAL primitiveType variableDeclarators
    ;

localVariableDeclarationStatement
    :    localVariableDeclaration SEMIOCOLON
    ;

localVariableDeclaration
    :    primitiveType variableDeclarators
    ;

variableDeclarators
    :   variableDeclarator (COMMA variableDeclarator)*
    ;

variableDeclarator
    :   Identifier (ASSIGN variableInitializer)?
    ;

variableInitializer
    :   expression
    |   Identifier
    ;

// 6. Expressions
parExpression
    :   OPEN_BRACKET expression CLOSE_BRACKET
    ;

expression
    :   logicalExpression (ASSIGN logicalExpression)?
    ;

logicalExpression
    :   comparisonExpression (logicalOperator comparisonExpression)*
    ;

comparisonExpression
    :   mathExpression (comparisonOperator mathExpression)*
    ;

mathExpression
    :   unaryExpression (mathOperator unaryExpression)*
    ;

unaryExpression
    :   ADD unaryExpression
    |   SUB unaryExpression
    |   INCREMENT unaryExpression
    |   DECREMENT unaryExpression
    |   unaryNotPlusMinusExpression
    ;

unaryNotPlusMinusExpression
    :   castExpression
    |   methodCallExpression
    |   primitiveTypeExpression
    |   Identifier (INCREMENT | DECREMENT)?
    |   NUMBER (INCREMENT | DECREMENT)?
    |   LINE
    ;

primitiveTypeExpression
    :   defaultPrimitiveTypeExpression
    |   multiPrimitiveTypeExpression
    ;

defaultPrimitiveTypeExpression
    :   primitiveType OPEN_BRACKET expression COMMA expression CLOSE_BRACKET
    ;

multiPrimitiveTypeExpression
    :   primitiveType OPEN_BRACKET expression? (COMMA expression)* CLOSE_BRACKET
    ;

castExpression
    :   OPEN_BRACKET primitiveType CLOSE_BRACKET unaryExpression
    ;

methodCallExpression
    :   Identifier methodCallArguments
    |   getExpression
    |   sizeExpression
    |   printlnExpression
    ;

getExpression
    :   Identifier DOT GET OPEN_BRACKET NUMBER CLOSE_BRACKET
    ;

sizeExpression
    :   Identifier DOT SIZE OPEN_BRACKET CLOSE_BRACKET
    ;

printlnExpression
    :   PRINTLN OPEN_BRACKET expression CLOSE_BRACKET
    ;

methodCallArguments
    :   OPEN_BRACKET expression? (COMMA expression)* CLOSE_BRACKET
    ;

// 7. Identifiers
Identifier : [a-zA-Z_] [a-zA-Z0-9_]*;

// 8. Whitespace and comments
WS : [ \t\r\n\u000C]+ -> skip;
COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> skip;
