Конкатенация — операция объединения строк, что возвращает новую строку, что является результатом объединения второй строки с окончанием первой. 
Операции конкатенации могут быть выполнены так:

```java
public class Concat {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        String str = "ABC";
        str += "DEF";

        String str2 = "one".concat("two").concat("three");

        stringBuffer.append("DDD").append("EEE");
        stringBuilder.append("FFF").append("GGG");
        System.out.println(str + " " +str2 + " " + stringBuffer.toString() + " " + stringBuilder.toString());//ABCDEF onetwothree DDDEEE FFFGGG
    }
}
```
Сравнение производительности конкатенации строк:
         
      Оператор ‘+=’ > 92.243 с;
      String.concat() > 1.254 с;
      StringBuffer > 1.208 с;
      StringBuilder > 1.121 с.
