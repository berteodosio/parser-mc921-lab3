grammar SimpleMath;

root        : s;

s           : s SEMICOLON s
            | var_declaration
            | func_declaration
            | EOF
            ;

var_declaration : VAR ID EQ num_expression;

func_declaration : FUNC ID LPAREN func_param_list RPAREN func_body;

func_param_list : ID (COMMA ID)*;

func_body : num_expression;

func_invocation : ID LPAREN func_invocation_param_list RPAREN;

func_invocation_param_list : func_invocation_param
                           | func_invocation_param (COMMA func_invocation_param)*
                           ;

func_invocation_param : ID
                      | NUM
                      ;

num_expression  : num_expression SUB num_expression_t
                | num_expression ADD num_expression_t
                | num_expression_t
                ;

num_expression_t : num_expression_t MUL num_expression_f
                 | num_expression_t DIV num_expression_f
                 | num_expression_f
                 ;

num_expression_f : ID                           // TODO: expression_f also maybe a function invocation
                 | NUM
                 | LPAREN num_expression RPAREN
                 | func_invocation
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
