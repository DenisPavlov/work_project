var a: array [1..10] of real;
    i,j: integer;
    t: real;

begin
  randomize;

  for i:= 1 to 10 do
    begin
      a[i]:=random;
      write(a[i]:6:3);
    end;

  writeln;

  for i:= 1 to 9 do
    for j:=i+1 to 10 do
      if a[i]>a[j] then
        begin
          t:=a[i];
          a[i]:=a[j];
          a[j]:=t;
        end;

  for i:= 1 to 10 do write (a[i]:6:3);

end.
