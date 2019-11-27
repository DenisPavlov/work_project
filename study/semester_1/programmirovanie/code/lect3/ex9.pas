var x,y, H: real;
    i: integer;

begin

  x:=0; H:=0.1;

  for i:= 1 to 100 do
    begin
      y:=sin(x);
      writeln('y = ', y);
      x:=x+H;
    end;

end.
