uses crt, graph;
vargd, gm: integer;

begin

  gd:=detect;

  initgraph (gd, gm, 'c:\tp6\bgi'); {укажите правильный путь до bgi}

  if graphresult <> 0 then

  begin

    write ('ошибка графики:', grapherrormsg (graphresult));

    halt;

  end;

  closegraph;

end.
