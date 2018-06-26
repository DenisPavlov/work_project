package links.multithreading.golovach.jmm;

public class App00_norm {
    static volatile boolean run = true;
    static int data = 0;

    public static void main(String[] args) {
        new Thread(() -> {
            while (run) {
                System.out.println(data);
            }
        }).start();

        run = false;
        data = 1;
    }
}
