У каждой обертки для примитивов есть свой метод <code>valueOf(String s)</code>, который возвращает преобразованное численное значение из строки.
При этом форматы строки и принимаемого типа должны совпадать. Например:
```java
public class Concat {
    public static void main(String[] args) {
        String x = "523.5";
        Double xd = Double.valueOf(x);

        //Integer xy = Integer.valueOf(x); //java.lang.NumberFormatException: For input string: "523.5"

        System.out.println(xd); //523.5
    }
}
```
