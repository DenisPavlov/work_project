var i, s, res: real;
    plus: boolean;

begin
  i:=0.1; s:=0.3; res:=0;
  plus:=false;
  
  while (i<2) or (i=2) do
    begin
      if (plus) 
        then res:=res+i
        else res:=res-i;
      i:=i+s;
      plus:= not plus;
    end;

  writeln('Результат: ', res:7:3);

end.
