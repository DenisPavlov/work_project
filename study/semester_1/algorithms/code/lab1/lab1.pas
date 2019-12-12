
{сортировка методом прямого выбора}
procedure directChoice(var arr: array of integer);
var i,j,tmp: integer;
begin
 for i:=0 to high(arr) do 
   begin
     for j:=i+1 to high(arr) do 
       begin
         if (arr[j] < arr[i]) then
           begin
             tmp:=arr[i];
             arr[i]:=arr[j];
             arr[j]:=tmp;
           end;
       end;
   end;
end;

{сортировка Шелла}
procedure shellSort(var arr: array of integer);
var d,n,j,i,tmp: integer;
begin
  n:=high(arr);
  d:=n div 2;
  while (d>0) do
    begin
      for i:=0 to n-d do
        begin
          j:=i;
          while ((j>=0) and (arr[j]>arr[j+d])) do
            begin
              tmp:=arr[j];
              arr[j]:=arr[j+d];
              arr[j+d]:=tmp;
              j:=j-1;
            end;
        end;
      d:=d div 2;
    end;
end;

{вывод элементов массива на экран}
procedure arrayPrint(var arr: array of integer);
var i: integer;
begin
  for i:=0 to high(arr) do
    begin
      write(arr[i]:4);
    end;
  writeln;
end;

var arr: array [0..20] of integer;
      i: integer;
begin
    for i:=0 to high(arr) do
    begin
      arr[i]:=random(100);
    end;
    arrayPrint(arr);
    
    directChoice(arr); {сортировка методом прямого выбора}
    arrayPrint(arr);
    
    writeln();
    for i:=0 to high(arr) do
    begin
      arr[i]:=random(100);
    end;
    arrayPrint(arr);
    
    shellSort(arr); {сортировка Шелла}
    arrayPrint(arr);
    
end.
