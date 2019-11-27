var a, b, max, min: integer;

Begin

a := 5; b := 33;

if a>b then

  begin max:=a; min:=b; end

  else begin min:=a; max:=b; end;
  
Writeln('max ', max);
Writeln('min ', min);
  
End.
