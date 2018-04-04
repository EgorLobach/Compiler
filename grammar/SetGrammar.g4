grammar SetGrammar;

MAIN : 'main';

OPEN_BRACKET : '(';
CLOSE_BRACKET : ')';
OPEN_CURLY_BRACKET : '{';
CLOSE_CURLY_BRACKET : '}';
OPEN_SQUARE_BRACKET : '[';
CLOSE_SQUARE_BRACKET : ']';

INT: 'int';
ELEMENT: 'element';
SET: 'set';
setExpression : OPEN_CURLY_BRACKET (NAME COMMA)* NAME CLOSE_CURLY_BRACKET;

PRINT: 'print';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
RETURN: 'return';
FUNCTION: 'function';
SIZE: 'size';
GET: 'get';
INDEX_OF: 'indexOf';

EQULS : '=';
DOT: '.';
COMMA : ',';
PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIVIDE : '/';

NEGATION : '!';
EQUAL: '==';
NON_EQUAL: '!=';
LESS: '<';
GREATER: '>';

SPACE :   [ \n\t\r]+ -> skip;

NAME : [a-zA-Z_][a-zA-Z_0-9]* ;
NUMBER : [0-9]+ ;
LINE : '"'(.)+?'"';


program: MAIN block (functionReturn|functionNonReturn)*;
block : OPEN_CURLY_BRACKET content* CLOSE_CURLY_BRACKET;
declaration: SET? NAME EQULS expression;
declarationElement: ELEMENT? NAME EQULS (LINE|functionCall|getExpression);

print: PRINT OPEN_BRACKET LINE CLOSE_BRACKET;
printSet: PRINT OPEN_BRACKET NAME CLOSE_BRACKET;

inputSignature: OPEN_BRACKET (NAME COMMA)* NAME CLOSE_BRACKET;
functionCall: (NAME (inputSignature|(OPEN_BRACKET CLOSE_BRACKET)));


type: SET|ELEMENT;
signatureFunction: OPEN_BRACKET (type NAME COMMA)* (type NAME) CLOSE_BRACKET;
functionReturn : FUNCTION type NAME (signatureFunction|(OPEN_BRACKET CLOSE_BRACKET)) blockReturn;
functionNonReturn : FUNCTION NAME (signatureFunction|(OPEN_BRACKET CLOSE_BRACKET)) blockNonReturn;

blockReturn : OPEN_CURLY_BRACKET content* RETURN NAME CLOSE_CURLY_BRACKET;
blockNonReturn : OPEN_CURLY_BRACKET content* RETURN CLOSE_CURLY_BRACKET;

equalCompare: (expression) (EQUAL|NON_EQUAL) (expression);
compare: (sizeExpression) (EQUAL|NON_EQUAL|LESS|GREATER) (sizeExpression);
simpleCompare : equalCompare|compare|indexOfExpression;
negationCompare : NEGATION OPEN_BRACKET simpleCompare CLOSE_BRACKET;
elseBlock: ELSE block;
ifBlock : IF OPEN_BRACKET (simpleCompare|negationCompare) CLOSE_BRACKET block elseBlock?;

whileBlock: WHILE OPEN_BRACKET (simpleCompare|negationCompare) CLOSE_BRACKET block;

sizeExpression: NAME DOT SIZE OPEN_BRACKET CLOSE_BRACKET;
getExpression: NAME DOT GET OPEN_BRACKET NUMBER CLOSE_BRACKET;
indexOfExpression: NAME DOT INDEX_OF OPEN_BRACKET NAME CLOSE_BRACKET;

expression:
        setExpression
    |   NAME PLUS NAME
    |   NAME MINUS NAME
    |   NAME MULTIPLY NAME
    |   NAME DIVIDE NAME
    |   NAME
    |   functionCall
    |   getExpression
    ;

content :
        print
    |   declaration
    |   declarationElement
    |   printSet
    |   functionCall
    |   ifBlock
    |   whileBlock
    ;