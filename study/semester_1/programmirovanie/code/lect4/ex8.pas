var m: array [1..5,1..10] of integer;
    i,j,s, min: integer;

begin
  randomize;

  for i:=1 to 5 do
    begin
      for j:=1 to 10 do
        begin
          m[i,j]:=random(100);
          write(m[i,j]:4);
        end;
    writeln;
  end;

  s:=0; min:=m[1,1];

  for i:=1 to 5 do
    for j:=1 to 10 do
      begin
        s:=s+m[i,j];
        if m[i,j] < min then min:=m[i,j];
      end;
  writeln('S = ',s,' min = ',min);

end.
