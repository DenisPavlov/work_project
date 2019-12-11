type detal = record
  name: string[20];
  kod: integer;
  weight: real;
end;

var d, dd: detal;

Begin
  d.name:='гайка';
  d.kod:=155;
  d.weight:=0.057;

  writeln('Деталь: ',d.name,' Код: ', d.kod,' Вес: ',d.weight);
  
  
  with dd do
  begin
    name:='Деталька';
    kod:=404;
    weight:=1980;
  end;
  writeln('Деталь: ',dd.name,' Код: ', dd.kod,' Вес: ',dd.weight);

End.
