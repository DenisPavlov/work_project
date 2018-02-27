```java
public class Concat {
    public static void main(String[] args) {
        String s = "ABCDEFG";
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        System.out.println(stringBuilder.toString()); //GFEDCBA
    }
}

```