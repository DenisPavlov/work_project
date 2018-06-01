Ответ со статьи https://habr.com/post/213319/

Появившийся в Java8 класс CompletableFuture — средство для передачи информации между параллельными потоками исполнения.
По существу это блокирующая очередь, способная передать только одно ссылочное значение.
В отличие от обычной очереди, передает также исключение, если оно возникло при вычислении передаваемого значения. 

Как средство передачи данных, класс <code>CompletableFuture</code> имеет два суб-интерфейса — для записи и для чтения, 
которые в свою очередь делятся на непосредственные (синхронные) и опосредованные (асинхронные)

#### Интерфейс непосредственной записи
Базовых методов, понятно, два — записать значение и записать исключение:
````java
boolean complete(T value)
boolean completeExceptionally(Throwable ex)
````
с очевидной семантикой.

Прочие методы: 
````java
boolean cancel(boolean mayInterruptIfRunning)
````
эквивалентен <code>completeExceptionally(new CancellationException)</code>. Введен для совместимости с <code>java.util.concurrent.Future</code>.
````java
static <U> CompletableFuture<U> completedFuture(U value)
````
эквивалентен <code>CompletableFuture res=new CompletableFuture(); res.complete(value)</code>.
````java
void obtrudeValue(T value)
void obtrudeException(Throwable ex)
````
Насильно перезаписывают хранящееся значение. Верный способ выстрелить себе в ногу.

#### Интерфейс непосредственного чтения
````java
boolean isDone() //Проверяет, был ли уже записан результат в данный фьючерс.
T get() //
````
Ждет, если результат еще не записан, и возвращает значение. Если было записано исключение, бросает <code>ExecutionException</code>.

Прочие методы:
````java
boolean isCancelled() //проверяет, было ли записано исключение с помощью метода cancel().
T join() //То же, что get(), но бросает CompletionException.
T get(long timeout, TimeUnit unit) //get() с тайм-аутом.
T getNow(T valueIfAbsent)
````
возвращает результат немедленно. Если результат еще не записан, возвращает значение параметра <code>valueIfAbsent</code>.
````java
int getNumberOfDependents() //примерное число других CompletableFuture, ждущих заполнения данного.
````

#### Интерфейс опосредованной записи
````java
static <U> CompletableFuture<U> supplyAsync(Supplier<U> supplier)
````
Запускается задача с функцией <code>supplier</code>, и результат выполнения записывается во фьючерс. Запуск задачи производится на стандартном пуле потоков.
````java
static <U> CompletableFuture<U> supplyAsync(Supplier<U> supplier, Executor executor)
````
То же самое, но запуск на пуле потоков, указанном параметром <code>executor</code>.
````java
static CompletableFuture<Void> runAsync(Runnable runnable)
static CompletableFuture<Void> runAsync(Runnable runnable, Executor executor)
````
То же самое, что и <code>supplyAsync</code>, но акция типа <code>Runnable</code> и, соответственно, результат будет типа <code>Void<code>.

#### Интерфейс опосредованного чтения

##### Выполнить реакцию по заполнению данного фьючерса (линейная зависимость)
Эти методы имеют имена, начинающиеся с префикса then, имеют один параметр — реакцию, и возвращают новый фьючерс типа <code>CompletableFuture</code> для доступа к
результату исполнения реакции. Различаются по типу реакции.
````java
<U> CompletableFuture<U> thenApply(Function<? super T,? extends U> fn)
````
Основной метод, в котором реакция получает значение из данного фьючерса и возвращаемое значения передается в результирующий фьючерс.
````java
CompletableFuture<Void> thenAccept(Consumer<? super T> block)
````
Реакция получает значение из данного фьючерса, но не возвращает значения, так что 
значение результирующего фьючерса имеет тип Void.
