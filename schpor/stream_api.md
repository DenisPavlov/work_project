Методы интерфейса stream
----
<h4>reduce()
````java
Optional<T> reduce(BinaryOperator<T> накопитель)
T reduce(T значение_идентичности, BinaryOperator<T> накопитель)
````
Где:
- Т - тип элемента из потока данных
- накопитель - функция оперирующая двумя значениями и получающая результат
- значение_идентичности - начальное значение

````java
Optional<Integer> productObj = myList.stream().reduce((a,b) -> a*b);
if(productObj.isPresent())
    System.out.println("Product as Optional: " + productObj.get());
//результат умножения всех элементов

int product = myList.stream().reduce(2, (a,b) -> a*b);
//результат умножения всех элементов (и умноженных на начальное значение 2)
````

Еще один вариант метода:

````java
<U> U reduce(U значение_идентичности, BiFunction<U ,? super Т ,U> накопитель,
                BinaryOperator<U> объединитель)
````

Где:
- объединитель - функция, объединяющая два значения, получаемые функцией
    <b>накопитель</b>
    
````java
int parallelProduct = myList.parallelStream().reduce(l, (а,b) -> а*b,
(а,b) -> а*b);
````

Вычисление произведения квадратных корней

````java
double productOfSqrRoots = myList.parallelStream().reduce(
            1.0,
            (a,b) -> a * Math.sqrt(b),
            a,b) -> a * b
        );
````

<h4>parallel() 
- метод распарсалеливает поток

<h4>sequential() 
- метод заменяет параллельный поток последовательным

<h4>unordered()
- возвращает неупорядоченный поток

<h4>map()</h4>

````java
<R> Stream<R> mар (Function<? super Т, ? extends R> функция отображения)
````

Где:
- R - тип элемента из нового потока данных
- Т - тип элемента из вызывающего потока данных

````java
Stream<String> sqrtRootStrm = myList.stream().map((a) -> "hello" + a);
```` 

- методы <b>map()</b> возвращающие примитивы

````java
IntStreaa mapToInt(ToIntFunction<? super Т> функция_отображения);
LonqStream maapToLonq(ToLongFunction<? super Т> функция_отображения);
DoubleStream mapToDouble(ToDoubeFunction<? super Т> функция_отображения)
````
