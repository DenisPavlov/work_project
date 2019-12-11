uses crt;

type book = record
  name: string;
  autor: string;
  year: integer;
  str: string;
end;

var i,n,god: integer;
    ch: char;
    b: array [1..1000] of book;

begin
  i:=0;
  
  repeat
    inc(i);
    with b[i] do begin
      write('название:'); readln(name);
      write('автор:'); readln(autor);
      write('год:'); readln(year);
      write('количество страниц:'); readln(str);
    end;

    write('Еще вводить? Y/N'); readln(ch);
    writeln; n:=i;

  until (upcase(ch)='N');

  repeat{поиск в каталоге}

    write('Введите год'); readln(god);

    for i:=1 to n do
        if b[i].year=god then writeln(b[i].name, b[i].autor, b[i].year, b[i].str);
    writeln('Продолжить поиск? Y/N'); readln(ch);
until (upcase(ch)='N');

end.
