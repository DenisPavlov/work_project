package links.multithreading.golovach.lect05;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

//Producers / Consumers
public class App00 {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(16);

        //producer
        new Thread(() -> {
            int counter = 0;
            while (true){
                try {
                    Thread.sleep(1000);
                    queue.put(++counter);
                    System.out.println("put: " + counter);
                } catch (InterruptedException ignore) {/*NOP*/}
            }
        }).start();

        //consumer
        new Thread(() -> {
            while (true){
                Integer date = 0;
//                try {
//                    date = queue.take();
                    date = queue.poll();
                    if (date != null) {
                        System.out.println("take: " + date);
                    }
//                    System.out.println("take: " + date);
//                } catch (InterruptedException ignore) {/*NOP*/}
//                process(date);
            }
        }).start();
    }

    private static void process(final int date) {
        System.out.println("... processing " + date);
    }

}
