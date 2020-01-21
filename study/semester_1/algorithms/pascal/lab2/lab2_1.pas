
var a: array [0..7] of integer;
    i: Integer;

procedure StraightMerge;
{индексы i,j - два элемента из массива источника
k,l - две позиции в массиве приемнике,
up - переменная для управления направлением потока,
p - длинна сливаемых подпоследовательностей. Сначала ее значение равно 1, затем оно удваивается перед каждым
следующим проходом,
n - длинна массива (предположим, что всегда равен степени 2)}
var
  i, j, k, l, t : Integer; {диапазон индексов массива a is 0 .. 2*n-1}
  h, m, p, q, r, n : Integer;
  up : Boolean;
begin
  up := true;
  p := 1;
  n := high(a)+1;
  repeat
    h := 1;
    m := n;
    if up then
    begin
      i := 0;
      j := n - 1;
      k := n;
      l := 2 * n - 1;
    end
    else
    begin
      k := 0;
      l := n - 1;
      i := n;
      j := 2 * n - 1;
    end;

    repeat {слить по одной подпоследовательности из i и j-источников в k-приемник}
      if m >= p then q := p
      else q := m;

      m := m - q;

      if m >= p then r := p
      else r := m;

      m := m - r;

      while (q > 0) and (r > 0) do
      begin
        if a[i] < a[j] then
        begin
          a[k] := a[i];
          k := k + h;
          i := i + 1;
          q := q - 1;
        end
        else
        begin
          a[k] := a[j];
          k := k + h;
          j := j - 1;
          r := r - 1;
        end;
      end;

      while r > 0 do
      begin
        a[k] := a[j];
        k := k + h;
        j := j - 1;
        r := r - 1;
      end;

      while q > 0 do
      begin
        a[k] := a[i];
        k := k + h;
        i := i + 1;
        q := q - 1;
      end;

      h := -h;
      t:=k;
      k:=l;
      l:=t;

    until m = 0;
    up := not up;
    p := 2*p;
  until p >= n;

  if not up then
  begin
    for i:=0 to n-1 do
    begin
      a[i] := a[i+n];
    end;
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

begin
  for i:=0 to high(a) do
  begin
    a[i]:=random(100);
  end;
  arrayPrint(a);

  StraightMerge;

  arrayPrint(a);

end.
