var a: array [1..5,1..3] of integer;
    sum,i,j: integer;

begin
  for i:=1 to 5 do
    begin
      for j:=1 to 3 do
        begin
          a[i,j]:=i*j;
          write(a[i,j]:4);
        end;
      writeln;
    end;

  for j:=1 to 3 do
  begin
    sum:=0;
      for i:=1 to 5 do
        sum:=sum+ a[i,j];
        writeln('сумма ',j,'-го столбца = ',sum);
  end;

end.
