В Java 8 нет метода, который бы принудительно останавливал поток. Никто не гарантирует, что нить можно остановить. Она может остановиться только сама. Java имеет встроенный механизм оповещения потока, который называется Interruption (прерывание, вмешательство).

Класс <code>Thread</code> содержит в себе скрытое булево поле, которое называется флагом прерывания.
Установить этот флаг можно вызвав метод <code>interrupt()</code> потока.
Проверить же, установлен ли этот флаг, можно двумя способами. Первый способ — вызвать метод <code>boolean isInterrupted()</code> объекта потока, второй — вызвать статический метод <code>boolean Thread.interrupted()</code>.
Первый метод возвращает состояние флага прерывания и оставляет этот флаг нетронутым. Второй метод возвращает состояние флага и сбрасывает его.
Заметьте что <code>Thread.interrupted()</code> — статический метод класса <code>Thread</code>, и его вызов возвращает значение флага прерывания того потока, из которого он был вызван. 
Поэтому этот метод вызывается только изнутри потока и позволяет потоку проверить своё состояние прерывания.

У методов, приостанавливающих выполнение потока, таких как <code>sleep()</code>, <code>wait()</code> и <code>join()</code> есть одна особенность — если во время их выполнения будет вызван метод <code>interrupt()</code> этого потока, они, не дожидаясь конца времени ожидания, сгенерируют исключение <code>InterruptedException</code>.

```java
public class JoinClass implements Runnable {
    @Override
    public void run() {
        for (int i=0; i<100; i++) {
            if(!Thread.interrupted()) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException!");
                    System.err.println("Exception msg: " + e.getMessage());
                    return;
                }
            } else {
                System.out.println("Interrupted!");
                return;
            }
        }
    }
}

class TestClass {
    public static void main(String[] args) {
        Thread thread = new Thread(new JoinClass());
        thread.start();
        try {
            Thread.sleep(1000L); // выключаем поток main, чтобы в JoinClass.run() что-то успело посчитаться
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}
```
//Вывод
        
    0
    1
    ...
    8
    9 //счетчик был до 100
    InterruptedException!
    Exception msg: sleep interrupted

- В методе <code>main()</code> создаем объект класса <code>JoinClass</code> и запускаем его методом <code>run()</code>. Сначала проверяется не завершен ли уже этот поток, а затем каждые 100мс выводится значение счетчика.
- Главному методу приказывает подождать 1000мс, чтобы счетчик успел немножко посчитать.
- Вызываем <code>interrupt</code> метод у объекта класса <code>JoinClass</code>. После этого в цикле сразу ловится исключение и срабатывает return в блоке catch.
