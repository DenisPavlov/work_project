Методы интерфейса stream
----
#### reduce()
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

#### parallel() 
- метод распарсалеливает поток

#### sequential() 
- метод заменяет параллельный поток последовательным

#### unordered()
- возвращает неупорядоченный поток

#### map()

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

#### collect()

````java
<R, A> R collect(Collector<? super T, A, R> функция_накопления)
````

Где:
- R - тип получаемого результата
- T - тип элемента из потока данных
- A - тип накапливаемых внутри данных
- функция_накопления - порядок обработки коллекции

````java
List<NamePhone> npList = myList.stream()
    .map((a) -> new NamePhone(a.name,a.phonenum) 
    .collect(Collectors.toList());
````

#####Еще одна форма метода <b>collect</b>

````java
<R> R collect(Supplier<R> адресат, BiConsuшer<R, ? super Т> накопитель, BiConsumer<R, R> объединитель)
````

Где:
- адресат - порядок создания объекта, содержащего результат
- накопитель - добавляет элементы к адресату
- объединитель - служит для объединения двух частичных результатов

````java
LinkedList<NamePhone> npList = nameAndPhone.collect(
    () -> new LinkedList<>(),
    (list, element) -> list.add(element),
    (list A, list B) -> listA.addAll(list B));
````

#### allMatch(), anyMatch(), noneMatch
- выясняют, удовлетворяет ли один или несколько элементов указанному предикату

#### count()
- количество элементов в потоке

#### distinct()
- получение потока только с однозначными элементами

