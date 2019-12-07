
const kol_el=20;
type mas=array [1..kol_el] of integer;
var T:mas;
var i:integer;

procedure preobr(var a:mas);
var i, tmp:integer;
begin
  for i:=1 to kol_el do
    begin
      tmp := a[i];
      if ((tmp < 0) or (tmp = 0)) 
      then a[i]:=0
      else a[i]:=trunc(a[i]/3);{trunc - преобразование real в integer, 
                                дробная часть отбрасывается}
    end;
end;

function sum_even(b:mas):integer;
var i,s:integer;
begin
    s:=0;

    for i:=1 to kol_el do
      begin
        if ((b[i] mod 2) = 0) then s:=s+b[i];
      end;
      
      sum_even:=s;
end;

procedure array_print(a:mas);
var i: integer;
begin
for i:=1 to high(a) do 
    begin
      write(T[i]:4);
    end;
end;

begin
  randomize;

  for i:=1 to kol_el do 
    begin
      T[i]:=Random(50)-25;
      write(T[i]:4);
    end;
  
  writeln();
  
  preobr(T);
  array_print(T);
  
  write(#13,#10,#10,'Сумма четных элементов = ',sum_even(T));
    
end.
