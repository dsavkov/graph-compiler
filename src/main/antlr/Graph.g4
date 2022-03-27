grammar Graph;

// 1. Literals
NUMBER : [0-9] | [1-9]+[0-9];
LINE : '"'(.)+?'"';

// 2. Keywords
MAIN : 'main';
VOID : 'void';
FUNCTION : 'function';
IF : 'if';
ELSE : 'else';
FOR : 'for';
WHILE : 'while';
UNTIL : 'until';
RETURN : 'return';

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
PRINT : 'print';
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
COLON : ':';

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
compilationUnit
    :   functionDeclaration* mainFunctionDeclaration EOF
    ;

mainFunctionDeclaration
    :   FUNCTION VOID MAIN OPEN_BRACKET CLOSE_BRACKET functionBody
    ;

functionDeclaration
    :   FUNCTION (primitiveType | VOID) Identifier functionParameters functionBody
    ;

functionParameters
    :   OPEN_BRACKET functionParameterDecls? CLOSE_BRACKET
    ;

functionParameterDecls
    :   primitiveType formalParameterDeclsRest
    ;

formalParameterDeclsRest
    :   Identifier (COMMA functionParameterDecls)?
    ;

functionBody
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
    |   functionCallStatement
    |   expressionStatement
    ;

expressionStatement
    :   expression SEMIOCOLON
    ;

functionCallStatement
    :   functionCallExpression SEMIOCOLON
    ;

returnStatement
    :   RETURN expression SEMIOCOLON
    ;

ifStatement
    :   IF parExpression statement (ELSE statement)?
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
    :   primitiveType Identifier COLON expression
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
    |   functionCallExpression
    |   primitiveTypeExpression
    |   Identifier (INCREMENT | DECREMENT)?
    |   NUMBER (INCREMENT | DECREMENT)?
    |   LINE
    ;

primitiveTypeExpression
    :   defaultPrivitiveTypeExpression
    |   multiPrivitiveTypeExpression
    ;

defaultPrivitiveTypeExpression
    :   OPEN_CURLY_BRACKET expression COMMA expression CLOSE_CURLY_BRACKET
    ;

multiPrivitiveTypeExpression
    :   OPEN_CURLY_BRACKET expression? (COMMA expression)* CLOSE_CURLY_BRACKET
    ;

castExpression
    :   OPEN_BRACKET primitiveType CLOSE_BRACKET unaryExpression
    ;

functionCallExpression
    :   Identifier functionCallArguments
    |   getExpression
    |   sizeExpression
    |   printExpression
    ;

getExpression
    :   Identifier DOT GET OPEN_BRACKET NUMBER CLOSE_BRACKET
    ;

sizeExpression
    :   Identifier DOT SIZE OPEN_BRACKET CLOSE_BRACKET
    ;

printExpression
    :   PRINT OPEN_BRACKET expression CLOSE_BRACKET
    ;

functionCallArguments
    :   OPEN_BRACKET expression? (COMMA expression)* CLOSE_BRACKET
    ;

// 7. Identifiers
Identifier : [a-zA-Z_] [a-zA-Z0-9_]*;

// 8. Whitespace and comments
WS : [ \t\r\n\u000C]+ -> skip;
COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> skip;
