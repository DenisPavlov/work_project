1. Удивительно, почему компилятор не ругается, хотя метод ничего
не возвращает
```java
public class App {
    public static double sqr(double arg) {
        while (true); // Удивительно, но КОМПИЛИРУЕТСЯ!
    }

    public static void main(String[] args) {
        double d = sqr(10.0);  // sqr - навсегда "повиснет", и
        System.out.println(d); // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
    }
}
```
Компилятор пропустит и вилку
```java
public class App {
    public static double sqr(double arg) {
        if (System.currentTimeMillis() % 2 == 0) {
            return arg * arg; // ну ладно, вот твой double
        } else {
            while (true);     // а тут "виснем" навсегда
        }
    }
}
```
Интересно почему ???

Механизм исключений также позволяет ничего не возвращать
```java
public class App {
    public static double sqr(double arg) {
        throw new RuntimeException();
    }
}
```


- <a href="/notes/duration_to_interval_jdbc_postgres.md">Разбирался с сохранением INTERVAL data type (Duration, Interval, JDBC, PostgresQL)</a>

### Темы для статей
- <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Objects.html">java.util.Objects</a>
- разобраться с кодом package links.multithreading.golovach.lect04.App02; 
### Библиотеки
- для конфигурирования библиотека - <a href="https://github.com/lightbend/config/blob/master/HOCON.md">HOCON</a>
