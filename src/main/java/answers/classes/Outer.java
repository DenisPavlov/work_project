package answers.classes;

public class Outer {
    // Анонимный класс, который реализует интерфейс Hello
    static Hello h = new Hello() {
        public void show() {
            System.out.println("Метод внутреннего анонимного класса");
        }
    };

    public static void main(String[] args) {
        System.out.println(h.getClass());
        h.show();
    }
}

interface Hello {
    void show();
}