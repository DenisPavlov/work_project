var b: array [1..50] of integer;
    ras, s: real;
    num, i: integer;

begin
  randomize;

  for i:= 1 to 50 do b[i]:=random(100);

  for i:= 1 to 50 do write(b[i], ' ');

  s:=0;

  for i:= 1 to 50 do s:=s+b[i];

  s:=s/50;

  num:=1;

  ras:=abs(s-b[1]);

  for i:=2 to 50 do

  if abs(s-b[i]) < ras then

  begin

    ras:=abs(s-b[i]);

    num:=i;

  end;

  writeln('Среднее = ',s,' ближайший элемент b[',num,']=',b[num]);

end.
