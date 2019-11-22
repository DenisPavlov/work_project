Const D=10;

Var A, B, C, Y ,f: Real;

Begin

  randomize;

  A:=random;

  Write('введите числa B и C типа real:');

  Read(B,C);

  Y:=(A*Sqrt(Abs(Sin(A+B*C)))-Exp(-A*C))/Sqrt(Abs(2*B+D));

  WriteLn ('Y=', Y:8:3); {вывод результата}

  if (y>0) and (y<=20) then f:=2*y
    else if (y=0) then f:=y+2
            else if (y<0) or (y>25) then f:=y/2
                    else f:=0;

  WriteLn ('f=', f:8:3);

End.
