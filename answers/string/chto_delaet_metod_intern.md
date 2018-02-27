Когда метод <code>intern()</code> вызван, если пул строк уже содержит строку, эквивалентную к нашему объекту, что подтверждается методом <code>equals(Object)</code>, тогда возвращается ссылка на строку из пула.
В противном случае объект строки добавляется в пул и ссылка на этот объект возвращается.

Этот метод всегда возвращает строку, которая имеет то же значение, что и текущая строка, но гарантирует что это будет строка из пула уникальных строк.

Ниже приведен пример работы метода <code>intern()</code>

```java
public class Concat {

    public static void main(String[] args) {


        String a = "string a";
        String b = new String("string a");
        String c = b.intern();

        System.out.println(a == b); //false
        System.out.println(b == c); //false
        System.out.println(a == c); //true
    }
}    
```