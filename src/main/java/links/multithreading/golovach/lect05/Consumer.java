package links.multithreading.golovach.lect05;

public class Consumer implements Runnable {
    private final int id;
    private final SimpleElementBuffer buffer;

    public Consumer(final int id, final SimpleElementBuffer buffer) {
        this.id = id;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Integer elem = buffer.get();
                System.out.println(" " + System.currentTimeMillis() + ": " + elem + " consumer by C#" + id);
            } catch (InterruptedException ignore) {/*NOP*/}
        }
    }
}
