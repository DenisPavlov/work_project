Если вы открывали <code>java.lang.Enum</code>, то знаете, что метод <code>values()</code> возвращает массив всех констант Enum.
Поскольку каждое перечисление наследует <code>java.lang.Enum</code>, они имеют метод <code>values()</code>. Используя его, вы можете пройтись по всем константам перечисления определённого типа.

```java
public enum SimpleOperators implements Operator {
    PLUS {
        @Override
        public int apply(int a, int b) {
            return a + b;
        }
    },

    MINUS {
        @Override
        public int apply(int a, int b) {
            return a - b;
        }
    },

    MULTI {
        @Override
        public int apply(int a, int b) {
            return a * b;
        }
    },

    DIVISION {
        @Override
        public int apply(int a, int b) {
            return a / b;
        }
    }

}

class Main {
    public static void main(String[] args) {
        for (SimpleOperators simpleOperators : SimpleOperators.values()) {
            System.out.println(simpleOperators.apply(20, 10));
        }
    }
}
``` 