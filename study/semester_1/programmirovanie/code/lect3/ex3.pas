var i,j: integer;
    ok: boolean;

begin

  writeln('Введите i и j > 0');

  readln(i,j);

  ok:=(i>0) and (j>0);

  if (not ok) then begin
    writeln('Неверный ввод');
    halt;
  end;

end.
