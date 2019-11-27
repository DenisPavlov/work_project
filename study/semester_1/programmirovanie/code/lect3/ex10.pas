uses crt;

var i: integer;

begin

  for i:= 9 downto 1 do
    begin
      write(#8,i);
      delay(2000);
    end;

  write(#8,'Пуск');

end.
