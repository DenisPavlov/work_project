<code>Executor</code> — интерфейс, который может выполнять подтвержденные задачи.
Интерфейс предоставляет возможность избежать вникания в механику выполнения задачи и деталей использования выполняемого потока.
<code>Executor</code> обычно используется для явного создания нитей. Например так:

```java
//Вместо
Thread(new(RunnableTask())).start():
//Лучше использовать
Executor executor = anExecutor;
executor.execute(new RunnableTask1());
executor.execute(new RunnableTask2());
```