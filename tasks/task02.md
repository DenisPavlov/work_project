Имеется код:

````java
public class Task02 {
    public static void main(String[] args) {
        Float f1 = new Float(Float.NaN);
        Float f2 = new Float(Float.NaN);
        System.out.println( ""+ (f1 == f2)+" "+f1.equals(f2)+ " "+(Float.NaN == Float.NaN) );
    }
}
````

Что будет выведено в результате выполнения данного куска кода:
1) <code>false false false </code>
2) <code>false true false </code>
3) <code>true true false </code>
4) <code>false true true </code>
5) <code>true true true </code>

Разбор:
C первым выражением вроде всё ясно. Разные объекты, поэтому false. А вот дальше…
В Java <code>NaN</code>'ы несравнимы между собой. Но есть два исключения в работе класса <code>Float</code>:
1) Если <code>f1</code> и <code>f2</code> оба представляют <code>Float.NaN</code>, тогда метод equals возвращает true,
в то время как <code>Float.NaN==Float.NaN</code> принимает значение <code>false</code>.
2) Если <code>f1</code> содержит <code>+0.0f</code> в то время как <code>f2</code> 
содержит <code>-0.0f</code>, метод <code>equal</code> возвращает <code>false</code>,
в то время как <code>0.0f==-0.0f</code> возвращает <code>true</code>.
