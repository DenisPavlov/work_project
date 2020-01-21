{a = 14; 
* b = a / 7 + 10; 
* x = 1; 
* y = b / 3 + x;
if (2 * b > 5 * y ) or ( b < a – 3 ) ) then begin x = y – 2; y = x * 3 end;
if ( a > b / 3 + 5 ) and ( 2 * y > b ) ) then begin x = x – 1; y = x + y end;}

var a, b, x, y: real;

begin
	a := 14;
	b := a/7 + 10;
	x := 1;
	y := b/3 + x;
	
	if ((2 * b > 5 * y ) or ( b < a - 3 ) ) then 
		begin 
			x := y - 2; 
			y := x * 3;
		end;
		
	if (( a > b / 3 + 5 ) and ( 2 * y > b ) ) then 
		begin 
			x := x - 1; 
			y := x + y ;
		end;
		
	writeln(y);
end.
