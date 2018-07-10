package links.multithreading.golovach.jmm;

public class App01 {
    static boolean run = true;

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            run = false;
        });

        t.start();

        while (t.isAlive());

        while (run);

    }
}
