Var x,y,b: Real;

Begin
  x:=1.5; y:=1.6;
  
  if ((x-y)=0) 
    then b:= Ln(abs(x/y)) + (x*x+y)
    else if ((x-y)>0)
      then b:= Ln(abs(x*y)) + (x*x+y)
      else b:= (x*x+y);
  
  WriteLn('При x= ', x:5:3, ', y= ', y:5:3, ', b= ',b:5:3);
 
End.
