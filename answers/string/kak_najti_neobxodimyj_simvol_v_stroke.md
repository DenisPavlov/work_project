<code>str.indexOf(char ch)</code> или <code>lastIndexOf(ch c)</code> — вернет индекс первого и последнего вхождения символа.

```java
public class Concat {
    public static void main(String[] args) {

        String fs = "12345678904";
        int a = fs.indexOf("456"); //3
        int b = fs.lastIndexOf("4"); //10
        System.out.println(a);
        System.out.println(b);
    }
}
```