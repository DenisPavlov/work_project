Как написано в документации, “допустимо использовать оператор == вместо метода equals, если доподлинно известно, что хотя бы один из них ссылается на перечислимый тип” 
(“it is permissible to use the == operator in place of the equals method when comparing two object references if it is known that at least one of them refers to an enum constant”).
Причина этого очень простая — каждый из объектов enum’а создаётся только единожды, и поэтому, если вы создадите десять переменных равных <code>SomeEnum.RED</code>, они все будут ссылаться на один и тот же объект (а оператор == как раз это и проверяет).

Какие есть преимущества у оператора ==?
-

- Он никогда не выбросит <code>NullPointerException</code>:
```java
enum Color { BLACK, WHITE };

class Main {
    public static void main(String[] args){
      Color nothing = null;
      if (nothing == Color.BLACK);      // Всё отлично
      if (nothing.equals(Color.BLACK)); // выбрасывает NullPointerException
    }
}
```

- Как известно, сравнения через == проверяются на соответствия типов во время компиляции (это хорошо, т.к. поможет вовремя выявить ошибку):
```java
enum Color {BLACK, RED};
enum Chiral {LEFT, RIGHT}

class Main {
    public static void main(String[] args) {
        if (Color.BLACK.equals(Chiral.LEFT)); // Компилируется
        if (Color.BLACK == Chiral.LEFT);      // НЕ КОМПИЛИРУЕТСЯ!!! Несовместимые типы!
    }
}
```

- Этот вариант короче, и сразу понятно, что происходит именно проверка равенства (т.е. вариант более читаемый).

Какие есть преимущества у оператора equals()?
-

- Нет ни единого случая, когда переменная перечисляемого типа должна быть равна <code>null</code> — если вы так описываете какое-то особое состояние, то его можно просто заменить на ещё одно допустимое состояние enum’а. А значит, NPE не надо скрывать, так как это, вероятнее всего, ошибка, и чем раньше о ней станет известно, тем лучше.
- Какой Java-программист не знает, что делает <code>equals</code>? Такой вариант наоборот более читаем, так как для объектов мы привыкли использовать именно метод <code>equals</code>. Значит, и для enum’ов нужно поступать так же, чтобы не возникало путаницы.