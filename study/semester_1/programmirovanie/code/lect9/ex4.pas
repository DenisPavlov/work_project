{Программа, переписывающая из файла a.txt в файл b.txt все символы, кроме цифр.}

var ch: char;
    f1,f2: text;

begin
 assign(f1, 'a.txt');
 assign(f2, 'b.txt');

 reset(f1);
 rewrite(f2);

 repeat
  read(f1,ch);
  if (ch<='0') or (ch>='9') then write(f2,ch);
 until eof(f1);

 close(f1); 
 close(f2);

end.
