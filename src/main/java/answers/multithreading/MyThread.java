package answers.multithreading;

public class MyThread implements Runnable {
    private boolean isActive;
    void disable(){
        isActive=false;
    }
    MyThread(){
        isActive = true;
    }

    @Override
    public void run(){
        System.out.printf("Поток %s начал работу... \n",
                Thread.currentThread().getName());
        int counter=1; // счетчик циклов
        while(isActive){
            System.out.println("Цикл " + counter++);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("Поток прерван");
            }
        }
        System.out.printf("Поток %s завершил работу... \n",
                Thread.currentThread().getName());
    }
}
