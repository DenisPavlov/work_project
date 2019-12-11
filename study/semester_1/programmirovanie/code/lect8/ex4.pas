type izdanie = (book, magazine);

zap = record
  name: string;
  case tip: izdanie of
              book:(
                autor: string;
                year: integer;
                str: integer);
              magazine: (
                nomer: byte;
                god: integer);
            end;

var b: zap;

begin
   if tip = book then writeln (b.name, b.autor, b.year, b.str)
         else writeln (b.name, b.nomer, b.god);

end.
