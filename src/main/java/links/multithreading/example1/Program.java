package links.multithreading.example1;

public class Program                            // Класс с методом main()
{
    /*
        public static void main(String[] args)
        {
            SomeThing mThing = new SomeThing();     // mThing - объект класса, реализующего интерфейс Runnable

            Thread myThready = new Thread(mThing);	// Создание потока "myThready"
            myThready.start();				        // Запуск потока

            System.out.println("Главный поток завершён...");
        }
    */

    /*
    public static void main(String[] args) {
        //Создание потока
        Thread myThready = new Thread(new Runnable() {
            public void run() //Этот метод будет выполняться в побочном потоке
            {
                System.out.println("Привет из побочного потока!");
            }
        });
        myThready.start();    //Запуск потока

        System.out.println("Главный поток завершён...");
    }
     */


    public static void main(String[] args) {
        AffableThread mSecondThread;
        mSecondThread = new AffableThread();    //Создание потока
        mSecondThread.start();                    //Запуск потока

        System.out.println("Главный поток завершён...");
    }

}

