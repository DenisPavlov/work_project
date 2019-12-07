var a,b: integer;

procedure Stars; {без параметров}

var i: integer;

begin
  for i:=1 to 9 do write('*');
  writeln;
end;

begin
 Stars;

 for a:=1 to 4 do
 begin
   b:=sqr(a);
   writeln('a=',a,' b=',b);
   Stars; {вызов процедуры Stars }
 end;

end.
