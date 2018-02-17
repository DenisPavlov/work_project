package answers.multithreading;

public class SimpleThreadManager
{
    /*
    public static void main(String[] arg) {
        for(int i=0; i<10; i++) {
            Thread first = new SimpleThread();
            first.setName("Name " + i);
            first.start();
        }
    }
    */

    /*
    //можно использовать анонимный класс
    public static void main(String[] arg) {
        for (int i = 0; i < 10; i++) {
            Thread first = new Thread() {
                @Override
                public void run() {
                    try {
                        long pause = Math.round(Math.random() * 2000);
                        Thread.sleep(pause);
                        System.out.println(Thread.currentThread().getName() + " - pause="+pause);
                    } catch (InterruptedException i_ex) {
                    }
                }
            };
            first.setName("Name " + i);
            first.start();
        }
    }
    */

    public static void main(String[] arg) {
        for(int i=0; i<10; i++) {
            Runnable first = new SimpleRunnable();
            Thread t = new Thread(first);
            t.start();
        }
    }
}

class SimpleThread extends Thread
{
    @Override
    public void run() {
        try {
            long pause = Math.round(Math.random()*2000);
            Thread.sleep(pause);
            System.out.println(Thread.currentThread().getName() + " - pause="+pause);
        } catch(InterruptedException i_ex) {

        }
    }
}

class SimpleRunnable implements Runnable
{
    @Override
    public void run() {
        try {
            long pause = Math.round(Math.random()*2000);
            Thread.sleep(pause);
            System.out.println(Thread.currentThread().getName() + " - pause="+pause);
        } catch(InterruptedException i_ex) {

        }
    }
}
