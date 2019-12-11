type detal = record
  name: string[20];
  kod: integer;
  weight: real;
end;

var d: detal;

Begin
  d.name:='гайка';
  d.kod:=155;
  d.weight:=0.057;

  write('Деталь: ',d.name,' Код: ', d.kod,' Вес: ',d.weight);

End.
