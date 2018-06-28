Что произойдет при выполнении данного кода

````java
public class Main {
    Main a = new Main();
    int show() {
        return true ? null : 1;
    }
    public static void main(String[] args) {
        Main a = new Main();
    }
}
````

Ответ: При создании класса <code>Main</code> будет создаваться поле <code>a</code> класса <code>Main</code>,
что в свою очередь будет вызывать конструктор по умолчанию класса <code>Main</code> (и так в цикле).
Будет выкинут <code>java.lang.StackOverflowError</code> в строке 4.