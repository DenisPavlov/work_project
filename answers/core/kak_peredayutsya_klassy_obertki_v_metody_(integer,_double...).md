Классы обертки типа <code>Integer</code> передаются по значению ссылки.

Но т.к. это неизменяемые(immutable) классы, то сам объект изменен не будет

```java
public class Main {

    public Integer method(Integer i){
        Integer ii = new Integer(10);
        i = i + ii;
        return i;
    }

    public static void main(String[] args) {
        Main main = new Main();

        //Объект класса Integer
        Integer ii = new Integer(5);
        System.out.println("до передачи в метод(объект) " + ii);

        Integer iii = main.method(ii);
        System.out.println("после метода(объект) " + ii);

        //сравним два объекта
        System.out.println(ii == iii);
    }
}
```

На консоль выведет:

    до передачи в метод(объект) 5
    после метода(объект) 5
    false

Как видем метод не изменил объект и возвратил новый объект