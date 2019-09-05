grammar SimpleMath;


root : VAR ID EQ NUM SEMICOLON;





VAR : 'var';
ID : [a-z][a-zA-z]*;
EQ : '=';
NUM : [0-9]+;
SEMICOLON : ';';
