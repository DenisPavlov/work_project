Имеется код:
````java
//In File Other.java
package other;
public class Other { public static String hello = "Hello"; }

//In File Test.java
package testPackage;
import other.*;
class Test{
  public static void main(String[] args) {
    String hello = "Hello", lo = "lo";
    System.out.print((testPackage.Other.hello == hello) + " ");
    System.out.print((other.Other.hello == hello) + " ");
    System.out.print((hello == ("Hel"+"lo")) + " ");
    System.out.print((hello == ("Hel"+lo)) + " ");
    System.out.println(hello == ("Hel"+lo).intern());
  }
}
class Other { static String hello = "Hello"; }

````

В результате мы получим:
1) <code>false true true false true</code>
2) <code>false false true false true</code>
3) <code>true true true true true</code>
4) <code>true true true false true</code>
5) Все ответы неверны

Разбор:
Всё тот же строковый пул, но с нюансами. 
Итак, 6 малоизвестных фактов о строках в Java:
1. Строковые литералы в одном классе представляют собой ссылки на один и тот 
   же объект. 
2. Строковые литералы в разных классах, но в одном пакете представляют собой 
   ссылки на один и тот же объект. 
3. Строковые литералы в разных классах и разных пакетах всё равно представляют 
   собой ссылки на один и тот же объект. 
4. Строки, получающиеся сложением констант, вычисляются во время компиляции
   и далее смотри пункт первый. 
5. Строки, создаваемые во время выполнения НЕ ссылаются на один и тот же объект.
   (поэтому четвертый вывод — false)
6. Метод <code>intern</code> в любом случае возвращает объект из пула, 
   вне зависимости от того, когда создается строка, на этапе компиляции или
   выполнения. (Поэтому последний вывод — true).

Более подробно эта тема описана в пункте 3.10.5 спецификации Java.