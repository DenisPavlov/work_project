package links.multithreading.golovach.lect04;

public class App01 {
    public static void main(String[] args) {
        final Object monitor = new Object();
        new Thread(() -> {
            synchronized (monitor) {
                while (true) {
                    System.out.println("A");
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (monitor) {
                while (true) {
                    System.out.println("B");
                }
            }
        }).start();
    }
}
