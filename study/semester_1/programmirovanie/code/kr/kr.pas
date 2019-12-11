{ Сформировать двумерный массив A размером N x 2 (N - количество строк, 
* равное предпоследней цифре пароля (у меня 1) + 2; 2 – количество столбцов) с 
* помощью генератора случайных чисел и вывести элементы массива на экран
* и в файл. Найти наибольший элемент каждой строки матрицы А (оформить 
* нахождение максимального элемента в виде функции). Из этих 
* максимальных элементов составить одномерный массив F. Вывести элементы
*  массива F на экран и в файл.}

var A: array [1..3,1..2] of integer;
    i,j: integer;
    f : text;

begin
  assign(f,'kr.txt');

  randomize;
  
  rewrite(f);
  for i:=1 to 3 do
    begin
      for j:=1 to 2 do
        begin
          A[i,j]:=random(100);
          write(A[i,j]:4);
          write(f,A[i,j]:4);
        end;
    writeln;
    writeln(f);
  end;
  close(f);
end. 


{varm: array [1..5,1..10] of integer;

  i,j,s, min: integer;

begin

  randomize;

  for i:=1 to 5 do

  begin

    for j:=1 to 10 do

    begin

        m[i,j]:=random(100);

        write(m[i,j]:4);

    end;

    writeln;

  end;

  s:=0; min:=m[1,1];

  for i:=1 to 5 do

    for j:=1 to 10 do

    begin

        s:=s+m[i,j];

        if m[i,j]<min then min:=m[i,j];

    end;

  writeln(‘S = ’,s,’ min = ’,min);

end.
}
 
