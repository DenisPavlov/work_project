function f (x,y: integer): real;
begin
  f:=sqrt(sqr(x)+sqr(y));
end;

begin
  writeln('f=', f(6,8));
end.
