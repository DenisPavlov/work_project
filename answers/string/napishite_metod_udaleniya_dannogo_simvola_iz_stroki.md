Мы можем использовать метод **replaceAll** для замены всех вхождений в строку другой строкой.
Обратите внимание на то, что метод получает в качестве аргумента строку, поэтому мы используем класс Character для создания строки из символа, и используем её для замены всех символов на пустую строку.

```java
public class Concat {


    public static String removeChar(String str, char ch) {
        if (str == null)
            return null;
        return str.replaceAll(Character.toString(ch), "");
    }

    public static void main(String[] args) {

        String s = "abcabcabc";
        String result = removeChar(s, 'a');
        System.out.println(result); //bcbcbc
     }
}
```