var mas: array [1..10] of real;
    i: integer;
    
begin
  mas[1] := 1;
  for i:=1 to 10 do
    mas[i+1] := mas[i]*2;
    
  writeln ('сумма=', mas[5]);
end.
