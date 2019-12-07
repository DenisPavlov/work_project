var a: array [1..10] of real;
    i: integer;
    t: real;
    b: boolean;

begin
  randomize;

  for i:= 1 to 10 do
    begin
      a[i]:=random;
      write(a[i]:6:3);
    end;

  writeln;

  repeat
    b:=false;
    for i:= 1 to 9 do

    if a[i]>a[i+1] then
      begin
        t:=a[i];
        a[i]:=a[i+1];
        a[i+1]:=t;
        b:=true;
    end;

  until b=false; {Если b=false – это значит, что не было ни одной перестановки. Следовательно,
                  массив отсортирован, переходим к выводу отсортированного массива на экран: }

  for i:= 1 to 10 do write(a[i]:6:3);

end.
