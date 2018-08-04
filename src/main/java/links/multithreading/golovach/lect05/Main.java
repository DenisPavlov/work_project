package links.multithreading.golovach.lect05;

public class Main {
    public static void main(String[] args) {
        SimpleElementBuffer buffer = new SimpleElementBuffer();

        new Thread(new Producer(1, 1, 300, buffer)).start();
        new Thread(new Producer(2, 100, 500, buffer)).start();
        new Thread(new Producer(3, 10000,700, buffer)).start();

        new Thread(new Consumer(1, buffer)).start();
//        new Thread(new Consumer(2, buffer)).start();
    }
}
