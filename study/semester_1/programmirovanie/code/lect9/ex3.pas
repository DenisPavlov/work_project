var F1: file of char;
     x: char; 

Begin
 assign(F1,'mebel2.txt');

 reset(F1);

 while not eof(F1) do 
 begin
     read(F1,x);
     write(x);
 end;

 close(F1);

End.



while not eof(f) do read(f,x);
