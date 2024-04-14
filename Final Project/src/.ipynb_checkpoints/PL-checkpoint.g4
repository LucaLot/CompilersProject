grammar PL;

@header {
import backend.*;
}

@members {
}

program returns [Expr expr] : 
        prog_list EOF { $expr = new Block ($prog_list.list);}
        ;

prog_b returns [Expr expr] : 
        prog_list { $expr = new Block ($prog_list.list);}
        ;

prog_list returns [List<Expr> list]: 
        { List <Expr> statements = new ArrayList<Expr>(); }
        (statement (',')?
            { statements.add($statement.expr);} 
        )+ 
        {$list = statements;}
        ;
        
string_list returns [List<String> list]: 
        { List <String> statements = new ArrayList<String>(); }
        (Type ID (',')?
            { statements.add($Type.text + " " + $ID.text);} 
        )+ 
        {$list = statements;}
        ;
statement returns [Expr expr]
    : assignment ';'?                  {$expr = $assignment.expr; }
    | expression ';'?                  {$expr = $expression.expr; }
    ;

assignment returns [Expr expr]
    : Type ID '=' expression                              { $expr = new Assign($Type.text, $ID.text, $expression.expr); }
    | ID '=' expression                                   { $expr = new Reassign($ID.text, $expression.expr); }
    | 'function' Type ID '(' args=string_list ')' '{' body=prog_b '}' {$expr = new Declare($ID.text, $Type.text, $args.list, $body.expr);}
    ;

expression returns [Expr expr]
    : e1=expression '++' e2=expression                                           {$expr = new Concat($e1.expr, $e2.expr);}
    | e1=expression '+' e2=expression                                            {$expr = new Arith(Operator.ADD, $e1.expr, $e2.expr);}
    | e1=expression '-' e2=expression                                            {$expr = new Arith(Operator.SUB, $e1.expr, $e2.expr);}
    | '-' e1=expression                                                          {$expr = new Arith(Operator.SUB, new IntLiteral("0"), $e1.expr);}
    | e1=expression '*' e2=expression                                            {$expr = new Arith(Operator.MUL, $e1.expr, $e2.expr);}
    | e1=expression '/' e2=expression                                            {$expr = new Arith(Operator.MUL, $e1.expr, $e2.expr);}
    | e1=expression '<' e2=expression                                            {$expr = new Cmp(CmpOperators.LT, $e1.expr, $e2.expr);}
    | e1=expression '>' e2=expression                                            {$expr = new Cmp(CmpOperators.GT, $e1.expr, $e2.expr);}
    | e1=expression '=' e2=expression                                            {$expr = new Cmp(CmpOperators.EQ, $e1.expr, $e2.expr);}
    | e1=expression '<=' e2=expression                                            {$expr = new Cmp(CmpOperators.LTE, $e1.expr, $e2.expr);}
    | e1=expression '>=' e2=expression                                            {$expr = new Cmp(CmpOperators.GTE, $e1.expr, $e2.expr);}

    | 'for(' ID 'in' e1=expression '..' e2=expression ')' '{' body=prog_b '}'    {$expr = new For($ID.text, $e1.expr, $e2.expr, $body.expr);}
    | 'if(' comp=expression ')' '{' body1=prog_b '}' 'else' '{' body2=prog_b '}' {$expr = new Ifelse($comp.expr, $body1.expr, $body2.expr);}
    | 'print(' prog_list ')'                                                     {$expr = new Print($prog_list.list);}
    | ID'(' prog_list ')'                                                        {$expr = new Invoke($ID.text, $prog_list.list);}
    |'(' expression ')'                                                          {$expr = $expression.expr; }
    | NUMERIC                                                                    {$expr = new IntLiteral($NUMERIC.text); }
    | BOOL                                                                       {$expr = new BooleanLiteral($BOOL.text); }
    | STRING                                                                     {$expr = new StringLiteral($STRING.text); }
    | ID                                                                         {$expr = new IdentifierExpr($ID.text); }
    ;


Type : 'String' | 'Int' | 'Boolean';
NUMERIC : ('0' .. '9')+ ('.' ('0' .. '9')+)?;
STRING : '"' ( '\\"' | ~'"' )* '"' {setText(getText().substring(1,getText().length()-1));};
BOOL : 'true' | 'false';
ID : ('a' .. 'z' | 'A' .. 'Z' | '_') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*;
COMMENT : '/*' .*? '*/' -> skip;
WHITESPACE : (' ' | '\t' | '\r' | '\n')+ -> skip;