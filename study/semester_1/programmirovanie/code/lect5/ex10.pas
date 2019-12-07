function Summa (var x: array of real): real;

var i: integer;
    s: real;

begin
 s:=0;

 for i:=1 to high(x) do s:=s+x[i];

 summa:=s;

end;
