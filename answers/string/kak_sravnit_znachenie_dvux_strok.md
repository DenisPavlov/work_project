Оператор == работает с ссылками объекта String.
Если две переменные String указывают на один и тот же объект в памяти, сравнение вернет результат true.
В противном случае результат будет false, несмотря на то что текст может содержать в точности такие же символы.
Оператор == не сравнивает сами данные типа char. Для сравнения посимвольно необходимо использовать метод equals();

```java
public class Concat {
    public static void main(String[] args) {

        String s1 = new String("ABC");
        String s2 = new String("ABC");
        String s3 = "ABC";
        String s4 = "ABC";
        System.out.println(s1==s2); //false
        System.out.println(s3==s4); //true. Т.к. один набор литералов будет указывать на одну область памяти
        System.out.println(s1.equals(s2));//true

        s1=s2;
        System.out.println(s1==s2); //true
        if("someString" == "someString") { //true
            System.out.println("true");
        }
        System.out.println(s1.compareTo(s2)); //0
        System.out.println("C".compareTo("A")); //2
        System.out.println("A".compareTo("C")); //-2
    }
}
```
