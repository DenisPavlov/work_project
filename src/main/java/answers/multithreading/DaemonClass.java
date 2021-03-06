package answers.multithreading;

public class DaemonClass implements Runnable {

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Поток демон работает");
        }
    }
}

class DaemonMain {
    public static void main(String[] args) {
        Thread daemon = new Thread(new DaemonClass());
        daemon.setDaemon(true);
        daemon.start();
        System.out.println(daemon.isDaemon());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
