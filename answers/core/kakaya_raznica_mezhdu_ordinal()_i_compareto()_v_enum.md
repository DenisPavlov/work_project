Это прямое следование из предыдущего вопроса: на самом деле, <code>compareTo()</code> имитирует порядок, предоставляемый методом <code>ordinal()</code>, являющийся естественным порядком Enum.
Если коротко, Enum ограничивает сравнения в порядке их объявления.
Так же, стоит помнить, что данные константы сравнимы только с другими константами того же типа — сравнение разных типов констант может привести к ошибке компилятора.

Метод <code>compareTo()</code> класса java.Lang.Enum:
```java
    public final int compareTo(E var1) {
        if (this.getClass() != var1.getClass() && this.getDeclaringClass() != var1.getDeclaringClass()) {
            throw new ClassCastException();
        } else {
            return this.ordinal - var1.ordinal;
        }
    }
```
