var a,b: integer;

procedure Stroka(ch: char; n: integer);

var i: integer;

begin
 for i:=1 to n do write(ch);
 writeln;
end;

begin
 Stroka('+', 4);

 for a:=1 to 3 do
 begin
   b:=sqr(a);
   writeln('a=', a ,' b=',b);
   Stroka('*', 8);
 end;

end.
