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
SET_EXPRESSION : OPEN_SQUARE_BRACKET(NAME COMMA)*NAME CLOSE_SQUARE_BRACKET;

PRINT: 'print';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
RETURN: 'return';

EQULS : '=';
COMMA : ',';
PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIVIDE : '/';

SPACE :  (' ' | '\t' | '\r' | '\n')+ -> skip;

NAME : [a-zA-Z_][a-zA-Z_0-9]* ;
NUMBER : [0-9]+ ;
LINE : '"'(.)+?'"';


program: MAIN block;
block : OPEN_CURLY_BRACKET content* CLOSE_CURLY_BRACKET;
print: PRINT OPEN_BRACKET LINE CLOSE_BRACKET;
declaration: SET? NAME EQULS (expression) ;

print_set: PRINT OPEN_BRACKET NAME CLOSE_BRACKET;


expression:
        SET_EXPRESSION
    |   NAME PLUS NAME
    |   NAME MINUS NAME
    |   NAME MULTIPLY NAME
    |   NAME DIVIDE NAME
    |   NAME
    ;

content :
        print
    |   declaration
    |   print_set
    ;