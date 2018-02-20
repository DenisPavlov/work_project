<code>ExecutorService</code> исполняет асинхронный код в одном или нескольких потоках.
Создание инстанса <code>ExecutorService</code>’а делается либо вручную через конкретные имплементации (<code>ScheduledThreadPoolExecutor</code> или <code>ThreadPoolExecutor</code>), но проще будет использовать фабрики класса <code>Executors</code>.
Например, если надо создать пул с 2мя потоками, то делается это так:
```java
ExecutorService service = Executors.newFixedThreadPool(2);
```
Если требуется использовать кэширующий пул потоков, который создает потоки по мере необходимости, но переиспользует неактивные потоки (и подчищает потоки, которые были неактивные некоторое время), то это задается следующим образом:
```java
ExecutorService service = Executors.newCachedThreadPool();
```
Если требуется запустить асинхронный код несколько раз, то это будет выполняться так:
````java
ExecutorService service = Executors.newCachedThreadPool();
for(int i = 0; i < 10; i++) {
        service.submit(new Runnable() {
            public void run() {
            // snip... piece of code
        }
    });
}
````
Метод <code>submit</code> также возвращает объект <code>Future</code>, который содержит информацию о статусе исполнения переданного <code>Runnable</code> или <code>Callable</code> (который может возвращать значение).
Из него можно узнать выполнился ли переданный код успешно, или он еще выполняется. Вызов метода <code>get</code> на объекте <code>Future</code> возвратит значение, который возвращает <code>Callable</code> (или <code>null</code>, если используется <code>Runnable</code>). 
Метод имеет 2 checked-исключения: <code>InterruptedException</code>, который бросается, когда выполнение прервано через метод <code>interrupt()</code>, или <code>ExecutionException</code> если код в <code>Runnable</code> или <code>Callable</code> бросил <code>RuntimeException</code>, что решает проблему поддержки исключений между потоками.