Можно использовать метод <code>replace(CharSequence target, CharSequence replacement)</code>, который меняет символы в строке.
Можно преобразовать в массив символов и заменить символ там.
Можно использовать <code>StringBuilder</code> и метод <code>setCharAt(int index, char ch)</code>

```java
public class Concat {
    public static void main(String[] args) {
        String sb = "AABAA";
        String s = "ABCDEF".replace("C", "**");

        String sb2 = sb.replace(sb, "##");
        System.out.println(s + " " + sb2); //AB**DEF and ##

        String fs = "123456789";
        char[] charSequence = fs.toCharArray();
        charSequence[3] = '$';
        String nStr = String.valueOf(charSequence);
        System.out.println(nStr); //123$56789

        StringBuilder str = new StringBuilder("AMIT"); //0-A, 1-M, 2-I, 3-T
        str.setCharAt(3, 'L');
    }
}
```

