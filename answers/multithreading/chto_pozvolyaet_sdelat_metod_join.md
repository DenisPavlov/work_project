Одна нить (поток) может вызвать метод <code>join()</code> у другой нити. 
В результате первый поток (который вызвал метод) приостанавливает свою работу и ждет окончания работы второго потока (у объекта которого был вызван метод <code>join()</code>).
```java
public class TestClasss {
    public static void main(String[] args) {
        Thread threadExample = new Thread(new JoinClasss());
        threadExample.start();
        try {
            threadExample.join(); //public static void TestClass.main() connect to threadExample and wait for it.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("END: " + Calendar.getInstance().getTime());
    }
}

class JoinClasss implements Runnable {

    @Override
    public void run() {
        System.out.println("JoinClass.run() " + Calendar.getInstance().getTime());
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("afterSleep " + Calendar.getInstance().getTime());
    }
}
```
Вывод:

    END: Mon Feb 19 20:56:16 NOVT 2018
    JoinClass.run() Mon Feb 19 20:56:16 NOVT 2018
    afterSleep Mon Feb 19 20:56:21 NOVT 2018

После запуска метода main создается главный поток класса TestClasss.
- Затем мы создаем тестовый поток <code>threadExample</code> и запускаем его. Заставляем поток протупить 5 секунд внутри метода <code>JoinClass.run()</code>.
- После чего вызываем метод <code>join()<code> у второго потока. В этот момент главный поток подсоединяется к нашему второму потоку и ждет его завершения.
- Смотрим какое прошло время — 5 секунд. Т.е. главный поток ждал пока завершится <code>threadExample</code> до перехода к методу <code>System.out.println()</code>. В противном случае <code>System.out.println(«END: «)</code> выполнился сразу без ожидания пока выполнится <code>threadExample</code>.
