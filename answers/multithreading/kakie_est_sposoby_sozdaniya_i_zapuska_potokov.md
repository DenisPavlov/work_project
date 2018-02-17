Существует несколько способов создания и запуска потоков.

С помощью класса, реализующего <code>Runnable</code>:

- Создать объект класса, реализующего интерфейс <code>Runnable</code>
- Создать объект класса <code>Thread</code>, передав в конструктор реализацию интерфейса <code>Runable</code>
- Вызвать у созданного объекта <code>Thread</code> метод <code>start()</code> (после этого запустится метод <code>run()</code> у переданного объекта, реализующего <code>Runnable</code>)

С помощью класса, расширяющего <code>Thread</code>

- Создать объект класса <code>ClassName extends Thread</code>.
- Переопределить <code>run()</code> в этом классе (смотрите примере ниже, где передается имя потока ‘Second’)

С помощью класса, реализующего <code>java.util.concurrent.Callable</code>

- Создать объект класса, реализующего интерфейс <code>Callable</code>
- Создать объект <code>ExecutorService</code> с указанием пула потоков.
- Создать объект <code>Future</code>. Запуск происходит через метод <code>submit()</code>; Сигнатура: <code><T> Future<T> submit(Callable<T> task)<code>

```java
public class Main {
    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass("First");
        threadClass.start(); //method ThreadClass.run()

        Thread thread = new Thread(new RunnableClass("Second"));
        Thread thread2 = new Thread(new RunnableClass("Third"));
        Thread thread3 = new Thread(new RunnableClass("Fourth"));
        thread.start(); //method RunnableClass.run()
        thread2.start(); //method RunnableClass.run()
        thread3.start(); //method RunnableClass.run()
    }
}

//создание с помощью интерфейса Runable
class RunnableClass implements Runnable {
    private String localName;

    public RunnableClass() {
    }

    public RunnableClass(String localName) {
        this.localName = localName;
    }

    @Override
    public void run() {
        System.out.println("run() " + localName + " running");
    }

    public String getLocalName() {return localName;}
    public void setLocalName(String localName) {this.localName = localName;}
}

//наследование от класса Thread
class ThreadClass extends Thread {

    public ThreadClass() {
    }

    public ThreadClass(String name) {
        super(name);
    }

    public ThreadClass(Runnable target) {
        super(target);
        System.out.println(target + " will running");
    }

    @Override
    public void run() {
        System.out.println("ThreadClass run() method " + "Thread name is: " + this.getName());
    }
}
```

Пример с интерфейсом <code>Callable</code>:

```java
public class CallableExample {

    public static class WordLengthCallable implements Callable {
        private String word;
        public WordLengthCallable(String word) {
            this.word = word;
        }
        public Integer call() {
            return Integer.valueOf(word.length());
        }
    }

    public static void main(String args[]) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        Set<Future<Integer>> set = new HashSet<>();
        for (String word: args) {
            Callable<Integer> callable = new WordLengthCallable(word);
            Future<Integer> future = pool.submit(callable);
            set.add(future);
        }
        int sum = 0;
        for (Future<Integer> future : set) {
            sum += future.get();
        }
        System.out.printf("The sum of lengths is %s%n", sum);
        System.exit(sum);
    }
}
```
