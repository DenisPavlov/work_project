Deadlock, он же взаимная блокировка, явление при котором все потоки находятся в режиме ожидания.
Чтобы уменьшить шанс появления deadlock’a не рекомендуется использовать методы <code>wait()</code> и <code>notify()</code>.

```java
    final Object lock1 = new Object();
    final Object lock2 = new Object();
    
//Здесь будет дедлок
    void method01() {
        synchronized(lock1) {
            synchronized(lock2) {
               //doSomething()
            }
        }
    }
    
    void method1() {
        synchronized(lock2) {
            synchronized(lock1) {
               //doSomething()
            }
        }
    }
```

Чтобы избежать дедлока можно использовать только один блок <code>synchronized</code>, отказаться от wait-notify или использовать такую конструкцию:

```java
//Чтобы избежать дедлока, лучше использовать один lock.
//Если нельзя использовать только один lock, то применяйте такую схему   
    void method2() {
        if (identityHashCode(lock1)>=identityHashCode(lock2)) {
            synchronized(lock1) {
                synchronized(lock2) {
                  //doSomething()
                }
            }
        }
        else {
            synchronized(lock2) {
                synchronized(lock1) {
                   //doSomething()
                }
            }
        }
    }
```