program Sort_Marge;
uses crt;
type massiv=array[1..100] of integer;
var n, i: integer;
  A: massiv;
{процедура, сливающая массивы}
procedure Merge(var A: massiv; first, last: integer);
var middle, start, final , j: integer;
  mas: massiv;
begin
  middle:=(first+last) div 2; {вычисление среднего элемента}
  start:=first; {начало левой части}
  final:=middle+1; {начало правой части}
  for j:=first to last do {выполнять от начала до конца}
    if (start<=middle) and ((final>last) or (A[start]<A[final])) then
    begin
      mas[j]:=A[start];
      inc(start);
    end
    else
    begin
      mas[j]:=A[final];
      inc(final);
    end;
{возвращение результата в массив}
  for j:=first to last do A[j]:=mas[j];
end;
{рекурсивная процедура сортировки}
procedure MergeSort(var A: massiv; first, last: integer);
begin
  if first<last then
  begin
    MergeSort(A, first, (first+last) div 2); {сортировка левой части}
    MergeSort(A, (first+last) div 2+1, last); {сортировка правой части}
    Merge(A, first, last); {слияние двух частей}
  end;
end;
{основной блок программы}
begin
  clrscr;
  write('Размер массива > ');
  readln(n);
  for i:=1 to n do
  begin
    write(i, ' элемент > '); read(A[i]);
  end;
  MergeSort(A, 1, n); {вызов сортирующей процедуры}
  write('Упорядоченный массив: '); {вывод отсортированного массива}
  for i:=1 to n do write(A[i], ' ');
  readkey;
end.