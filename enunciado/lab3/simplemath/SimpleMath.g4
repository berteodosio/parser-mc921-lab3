grammar SimpleMath;

root        : s;

s           : s SEMICOLON s     # SSemicolonS
            | var_declaration   # VarDeclaration
            | func_declaration  # FuncDeclaration
            | EOF               # EndOfFile
            ;

var_declaration : VAR ID EQ expression;

func_declaration : FUNC ID LPAREN ID RPAREN expression;

expression  : expression SUB expression_t
            | expression ADD expression_t
            | expression_t
            ;

expression_t : expression_t MUL expression_f
             | expression_t DIV expression_f
             | expression_f
             ;

expression_f : ID
             | NUM
             | LPAREN expression RPAREN
             ;


WHITESPACE
 : [ \t\r\n] -> skip
 ;


VAR         : 'var';
FUNC        : 'func';

EQ          : '=';
SEMICOLON   : ';';

LPAREN  :   '(';
RPAREN  :   ')';
ADD     :   '+';
MUL     :   '*';
SUB     :   '-';
COMMA   :   ',';
DIV     :   '/';

ID          : [a-zA-Z_][a-zA-Z0-9_]*;
NUM         : [0-9]+;

ERROR_CHAR : . ;
