package notes;

public class App {
    public static double sqr(double arg) {
        while (true); // Удивительно, но КОМПИЛИРУЕТСЯ!
    }

    public static double sqr1(double arg) {
        if (System.currentTimeMillis() % 2 == 0) {
            return arg * arg; // ну ладно, вот твой double
        } else {
            while (true);     // а тут "виснем" навсегда
        }
    }

    public static void main(String[] args) {
        double d = sqr2(10.0);  // sqr - навсегда "повиснет", и
        System.out.println(d); // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
    }

    public static double sqr2(double arg) {
        throw new RuntimeException();
    }
}
