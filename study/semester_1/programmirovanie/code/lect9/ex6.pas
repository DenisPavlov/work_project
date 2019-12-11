{Программа, меняющая порядок символов в файле на обратный.}

var f1.f2: file of char;
  i,n: integer;
  ch: char;

begin
 assign(f1,'a.txt');
 assign(f2,'b.txt');
 
 reset(f1);

 rewrite(f2);

 h:=filesize(f1);

 for i:=h-1 downto 0 do

 begin

  seek(f1,i);

  read(f1,ch);

  write(f2,ch);

 end;

 close(f1);

 close(f2);

end.
