package answers.multithreading;

public class Main {
    public static void main(String[] args) {
        ThreadClass threadClass = new ThreadClass("First");
        threadClass.start(); //method ThreadClass.run()

        Thread thread = new Thread(new RunnableClass("Second"));
        Thread thread2 = new Thread(new RunnableClass("Third"));
        Thread thread3 = new Thread(new RunnableClass("Fourth"));
        thread.start(); //method RunnableClass.run()
        thread2.start(); //method RunnableClass.run()
        thread3.start(); //method RunnableClass.run()
    }
}

//создание с помощью интерфейса Runable
class RunnableClass implements Runnable {
    private String localName;

    public RunnableClass() {
    }

    public RunnableClass(String localName) {
        this.localName = localName;
    }

    @Override
    public void run() {
        System.out.println("run() " + localName + " running");
    }

    public String getLocalName() {return localName;}
    public void setLocalName(String localName) {this.localName = localName;}
}

//наследование от класса Thread
class ThreadClass extends Thread {

    public ThreadClass() {
    }

    public ThreadClass(String name) {
        super(name);
    }

    public ThreadClass(Runnable target) {
        super(target);
        System.out.println(target + " will running");
    }

    @Override
    public void run() {
        System.out.println("ThreadClass run() method " + "Thread name is: " + this.getName());
    }
}