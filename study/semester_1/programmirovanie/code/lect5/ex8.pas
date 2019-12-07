type mas=array [1..10] of integer;

var c,d: mas;
    i: integer;

procedure S(a: mas; var b: mas);
 var i: integer;
begin
 for i:=1 to 10 do
 begin
   a[i]:=a[i]*5;
   b[i]:=b[i]*5;
 end;
end;

begin

 for i:=1 to 10 do
 begin
   c[i]:=1;
   d[i]:=1;
 end;
 s(c,d);

 for i:=1 to 10 do write (c[i]:3);

 writeln;

 for i:=1 to 10 do write (d[i]:3);

end.
