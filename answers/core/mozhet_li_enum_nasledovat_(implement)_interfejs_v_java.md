Да, Enum может наследовать интерфейсы. 
Поскольку Enum тип схож с классом и интерфейсом, он может наследовать интерфейс. 
Это даёт поразительную гибкость в использовании Enum в качестве специальной реализации в некоторых случаях. 

Имеется интерфейс, представляющий операцию
```java
public interface Operator {
    int apply(int a, int b);
}
```
И реалиация интерфейса в перечислениии
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
    }
}
```

