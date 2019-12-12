
var A: array [1..3,1..2] of integer;
    i,j: integer;
    f : text;
    maxElements: array[1..3] of integer;

function maxElement (var x: array of integer): integer;
var i, max: integer;
begin
 max:=x[0];
 for i:=1 to high(x) do 
   begin
     if (x[i] > max) then max:=x[i]
   end;
 maxElement:=max;
end;


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
    
    maxElements[i]:=maxElement(A[i]);
  end;
  
  writeln();
  writeln(f);
  writeln('Максимальные элементы строк');
  writeln(f, 'Максимальные элементы строк');
  for i:=1 to 3 do
    begin
      write(maxElements[i]:4);
      write(f, maxElements[i]:4);
    end;

  writeln();
  writeln(f);   
  
  close(f);
end. 
