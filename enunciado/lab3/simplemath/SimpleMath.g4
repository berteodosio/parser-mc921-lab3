grammar SimpleMath;


root : VAR ID EQ NUM SEMICOLON;


VAR : 'var';
ID : [a-z][a-zA-Z]*;
EQ : '=';
NUM : [0-9]+;
SEMICOLON : ';';
