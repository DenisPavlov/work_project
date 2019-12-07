var s:real;
    i,n: integer;
    
function fact(k: integer): longint;
var f: longint;
    j: integer;
begin
  f:=1;
  for j:=1 to k do f:=f*j;
  fact:=f;
end;
begin
  write('Введите n');
  readln(n);
  
  S:=0;

  for i:=1 to n do s:=(s+1)/(fact(i)+fact(i+1)+fact(i+2));

  writeln('S = ',s:6:4);

end.
