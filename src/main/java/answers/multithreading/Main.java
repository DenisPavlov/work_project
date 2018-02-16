package answers.multithreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Главный поток начал работу...");
        MyThread myThread = new MyThread();
        new Thread(myThread,"MyThread").start();
        try{
            Thread.sleep(1100);
            myThread.disable();
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            System.out.println("Поток прерван");
        }
        System.out.println("Главный поток завершил работу...");
    }
}
