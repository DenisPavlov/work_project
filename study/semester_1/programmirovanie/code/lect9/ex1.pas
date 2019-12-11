var F1: file of char;
     x: char; 
     i:integer;

Begin
 assign(F1,'mebel.txt');

 reset(F1);

 for i:=1 to 4 do
   begin
     read(F1,x);
     write(x);
 end;

 close(F1);

End.
