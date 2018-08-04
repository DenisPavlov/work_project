package links.multithreading.golovach.lect05;

public class Producer implements Runnable {
    private int id;
    private int value;
    private final int period;
    private final SimpleElementBuffer buffer;

    public Producer(final int id, final int value, final int period, final SimpleElementBuffer buffer) {
        this.id = id;
        this.value = value;
        this.period = period;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(System.currentTimeMillis() + ": " + value + " produced by P#" + id);
                buffer.put(value++);
                Thread.sleep(period);
            } catch (InterruptedException ignore) {/*NOP*/}
        }
    }
}
