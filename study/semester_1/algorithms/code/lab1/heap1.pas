Uses Crt;
Const    N = 50;
Type    T_Mas = Array [0..N] of Integer;
Var   Mas : T_Mas;
    Kol : Integer;


{.......................пирамидальная сортировка........................}
procedure DownHeap(index, Count: integer; Current: integer);
 {Функция пробегает по пирамиде восстанавливая ее
 Также используется для изначального создания пирамиды
 Использование: Передать номер следующего элемента в index
 Процедура пробежит по всем потомкам и найдет нужное место для следующего элемента}
 var
  Child, k, i: Integer;
 begin
k:= Kol div 2;
for i:=1 to k-1 do
 begin
  while index < Count div 2 do
  begin
   Child := (index+1)*2-1;
   if (Child < Count-1) and (A[Child] < A[Child+1]) then
    Child:=Child+1;
   if Current >= A[Child] then
    break;
   A[index] := A[Child];
   index := Child;
  end;
  A[index] := Current;
 end;
 
procedure Sort_2(var A: T_Mas; Count: Integer);
 procedure DownHeap(index, Count: integer; Current: integer);
 {Функция пробегает по пирамиде восстанавливая ее
 Также используется для изначального создания пирамиды
 Использование: Передать номер следующего элемента в index
 Процедура пробежит по всем потомкам и найдет нужное место для следующего элемента}
 var
  Child, k: Integer;
 begin
k:= Kol div 2;
for i:=1 to k-1 do
 begin
  while index > Count div 2 do
  begin
   Child := (index+1)*2-1;
   if (Child > Count-1) and (A[Child] > A[Child+1]) then
    Child:=Child+1;
   if Current <= A[Child] then
    break;
   A[index] := A[Child];
   index := Child;
  end;
  A[index] := Current;
 end;
 
 
{Основная функция }
var
 i: integer;
 Current: integer;
begin
 {Собираем пирамиду}
 for i := (Count div 2)-1 downto 0 do
  DownHeap(i, Count, A[i]);
 {Пирамида собрана. Теперь сортируем}
 for i := Count downto 0 do begin
  Current := A[i];{перемещаем верхушку в начало отсортированного списка}
  A[i] := A[0];
  DownHeap(0, i, Current);{находим нужное место в пирамиде для нового элемента}
 end;
end;
{......................................................................}
Begin
ClrScr;
Count(Kol);
Filling(Kol, Mas);
WriteLn('Исходный массив');
Print (Kol, Mas);
{................процедура пирамидальной сортировки..........}
sort(Mas,Kol);
WriteLn;
WriteLn('Отсортированный массив');
Print (Kol, Mas);
Repeat until KeyPressed
End.
