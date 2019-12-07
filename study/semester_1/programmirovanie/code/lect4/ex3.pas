var m: array [1..1000] of real;
    p, max: real;
    i,n: integer;

begin
  i:=1;

  repeat
   write('Введите ',i,' элемент');
   readln(p);
   if p>0 then m[i]:=p;
   i:=i+1;
  until p<0;

  n:=i-1;

  max:=m[1];

  for i:=1 to n do

  if m[i]>max then max:=m[i];

  writeln('max = ', max);

end.
