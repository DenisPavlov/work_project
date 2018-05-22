package tasks;

public class Overload{
    public void method(Object o) {
        System.out.println("Object");
    }
    public void method(java.io.FileNotFoundException f) {
        System.out.println("FileNotFoundException");
    }
    public void method(java.io.IOException i) {
        System.out.println("IOException");
    }
    public static void main(String args[]) {
        Overload test = new Overload();
        test.method(null);
    }
}

class Overload1{
    public void method(Object o) {
        System.out.println("Object");
    }
    public void method(String s) {
        System.out.println("String");
    }
    public void method(StringBuffer sb) {
        System.out.println("StringBuffer");
    }
    public static void main(String args[]) {
        Overload1 test = new Overload1();
//        test.method(null); //ERROR (компилятор не может выбрать из одинаковых методов
    }
}
