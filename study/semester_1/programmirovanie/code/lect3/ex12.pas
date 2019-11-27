const n=2;
var s, x: real;

begin
  s:=0; x:= 0.2;

  while x<=n do 
	begin
	  s:=s + x;
      x:=x+ 0.2;
    end;

  writeln('S = ', s);

end.
