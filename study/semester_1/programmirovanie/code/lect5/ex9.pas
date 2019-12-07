type mas=array [1..10] of real;
var a: mas;
    i: integer;

function Summa (const x:mas): real;
 var i: integer;
     s: real;
begin
 s:=0;
 for i:=1 to 10 do s:=s+x[i];
 summa:=s
end;

begin
 randomize;

 for i:=1 to 10 do a[i]:=random(20);

 writeln('сумма элементов массива: ',summa(a));

end.
