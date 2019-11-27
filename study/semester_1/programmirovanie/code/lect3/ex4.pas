
var i: integer;

begin

i := 33;

case i of

  0,2,4,6,8: writeln('четная цифра');

  1,3,5,7,9: writeln('нечетная цифра');

  10..100: writeln('число от 0 до 100');

  else writeln('отрицательное число или >100');

end;

end.
