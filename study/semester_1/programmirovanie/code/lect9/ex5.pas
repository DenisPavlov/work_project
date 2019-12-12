{Программа для вычисления и вывода в файл таблицы Пифагора (таблицы умножения).}

Var i,j,n : Integer;
   f : Text;

Begin
 Assign(f, 'tab_pif.txt');

 Rewrite(f);

 For i := 1 to 9 do begin
  For j := 1 to 9 do begin
   n := i*j;
   Write(n:4);{вывод результата на экран}
   Write(f, n:4);{вывод результата в файл; т.е., если в процедуре Write первым параметром
      указана файловая переменная, то вывод осуществляется не на экран, а в файл,
      с которым связана эта переменная в процедуре Assign }
  end;

  WriteLn;{перевод строки на экране}
  WriteLn(f);{перевод строки в файле}
 end;

 Close(f);

End.