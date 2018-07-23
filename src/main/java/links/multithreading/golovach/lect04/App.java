package links.multithreading.golovach.lect04;

public class App {
    public static void main(String[] args) throws InterruptedException {
        f();
    }

    static synchronized void f(){g();}

    static synchronized void g(){
        h();
    }

    static synchronized void h() {
        System.out.println("Hello!!!" + Thread.holdsLock(App.class));
    }
}
