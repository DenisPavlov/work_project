package links.multithreading.golovach.lect04;

import java.util.concurrent.atomic.AtomicInteger;

public class App02 {
//    public static volatile int counter = 0;
    public static AtomicInteger counter = new AtomicInteger(0);
    private static volatile boolean flag1 = false;
    private static volatile boolean flag2 = false;
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 10_000_000; i++) {
                counter.incrementAndGet();
            }
            flag1 = true;
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10_000_000; i++) {
                counter.incrementAndGet();
            }
            flag2 = true;
        }).start();

        while (!flag1 && !flag2);
        System.out.println(counter);
    }
}
