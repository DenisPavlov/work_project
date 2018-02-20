Иногда требуется выполнение кода асихронно и периодически, или требуется выполнить код через некоторое время, тогда на помощь приходит <code>ScheduledExecutorService</code>.
Он позволяет поставить код выполняться в одном или нескольких потоках и сконфигурировать интервал или время, на которое выполненение будет отложено.
Интервалом может быть время между двумя последовательными запусками или время между окончанием одного выполнения и началом другого.
Методы <code>ScheduledExecutorService</code> возвращают <code>ScheduledFuture</code>, который содержит значение отсрочки для выполнения <code>ScheduledFuture</code>.

Если требуется отложить выполнение на 5 секунд, потребуется следующий код:
```java
ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
service.schedule(new Runnable() { ... }, 5, TimeUnit.SECONDS);
```
Если требуется назначить выполнение каждую секунду:
```java
ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
service.scheduleAtFixedRate(new Runnable() { ... }, 0, 1, TimeUnit.SECONDS);
```
И, наконец, если требуется назначить выполнение кода с промежутком 1 секунда между выполнениями:
```java
ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
service.scheduleWithFixedDelay(new Runnable() { ... }, 0, 1, TimeUnit.SECONDS);
```