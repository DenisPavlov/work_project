{передача по ссылке}

var a,b: integer;

procedure proc(x: integer; var y: integer);
begin
  y := x + y;
end;


begin
  a:=10;
  b:=10;
  writeln(a);
  writeln(b);
  
  proc(a,b);
  writeln(a);
  writeln(b);

end.
