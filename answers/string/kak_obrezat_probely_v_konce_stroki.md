```java
public class Concat {
    public static void main(String[] args) {
        String s = "     a    ";
        System.out.println("b" + s.trim() + "b");//bab
        System.out.println("b" + s + "b");//b     a    b
    }
}
```