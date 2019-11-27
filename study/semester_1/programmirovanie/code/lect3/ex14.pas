var k: integer;
    ch: char;

begin

  repeat
    writeln('Введите символ');
    readln(ch);
    k:=ord(ch);
    writeln('Код символа', ch, ' = ',k);
  until k=13; {13 – код пробела}

end.
