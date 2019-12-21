
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

{просеивание кучи}  
procedure downHeap(var arr: array of integer; index: integer);
  var lenth,left,right,min,tmp: integer;
  begin
  lenth := index;
  while ((index>0) or (index=0)) do
    begin
	  left := index*2+1;
	  right := index*2+2;
	  min := index;
	
	  if ((left < lenth) and (arr[left] > arr[min])) then min := left;
      if ((right < lenth) and (arr[right] > arr[min])) then min := right;
        
      if (min <> index) then
        begin
          tmp := arr[index];
          arr[index] := arr[min];
          arr[min] := tmp;
        end;
          
      index := index -1;
	end;
  end;

{пирамидальная сортировка}
procedure heapSort(var arr: array of integer);
  var i,tmp: integer;
  begin
  i:= high(arr)-1;
  while (i <> 0) do
    begin
      downHeap(arr, i);
      
      {поменять местами последний и первый элементы массива}
      tmp := arr[0];
      arr[0] := arr[i];
      arr[i] := tmp;
      i := i - 1;
      
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
    
    writeln();
    for i:=0 to high(arr) do
    begin
      arr[i]:=random(100);
    end;
    arrayPrint(arr);
    
    heapSort(arr); {пирамидальная сортировка}
    arrayPrint(arr);
    
end.
