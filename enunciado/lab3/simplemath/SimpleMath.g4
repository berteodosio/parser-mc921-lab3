grammar SimpleMath;

root        : s;

s           : s SEMICOLON s     # SSemicolonS
            | var_declaration   # VarDeclaration
            | func_declaration  # FuncDeclaration
            | EOF               # EndOfFile
            ;

var_declaration : VAR ID EQ expression;

func_declaration : FUNC ID LPAREN func_param_list RPAREN expression;    // TODO: AFTER FUNC DECLARATION WRITE FUNC_BODY

func_param_list : ID (COMMA ID)*;

expression  : expression SUB expression_t
            | expression ADD expression_t
            | expression_t
            ;

expression_t : expression_t MUL expression_f
             | expression_t DIV expression_f
             | expression_f
             ;

expression_f : ID                           // TODO: expression_f also maybe a function invocation
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
