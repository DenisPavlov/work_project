Label M1;
var x,y,res: integer;

begin
  write('Введите x,y');

  readln(x,y);

  if y=0 then
    begin
      writeln('Деление на ноль!');
      goto M1;
    end;

  res:=x div y;

  writeln('Частное = ', res);

  M1: writeln('Конец программы');

end.
