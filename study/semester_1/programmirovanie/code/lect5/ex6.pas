{передача по значению}

var a: integer;

procedure proc(x: integer);
begin
  x := x + 2;
end;


begin
  a:=10;
  writeln(a);
  
  proc(a);
  writeln(a);

  proc(a*a);
  writeln(a);
  
  proc(25);
  writeln(a);

end.
