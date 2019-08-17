package links.java.generics.g01;

import java.util.*;
public class HelloWorld{
    public static void main(String []args){
        /*
        List list = new ArrayList();
        list.add("Hello");
        String text = list.get(0) + ", world!";
        //String text = list.get(0); //Error:(9, 31) java: incompatible types: java.lang.Object cannot be converted to java.lang.String
        System.out.print(text);
         */

        /*
        List<String> list = new ArrayList<>();
        list.add("Hello World");
        String data = list.get(0);
        System.out.println(data);
         */

        /*
        List<String> list = Arrays.asList("Hello", "World");
        List<Integer> data = new ArrayList(list);
        Integer intNumber = data.get(0);
        System.out.println(data);
         */

        /*
        List list = Arrays.asList("Author", "Book");
        for (Object element : list) {
            String data = Util.getValue(element, String.class);
            System.out.println(data);
            System.out.println(Util.<String>getValue(element));
        }
         */
        /*
        NumberContainer number1 = new NumberContainer(2L);
        NumberContainer number2 = new NumberContainer(1);
        number1.setNumber(22L);
        number1.getNumber();
        //NumberContainer number3 = new NumberContainer("f");
         */

    }

    public static class TestClass {
        public static void print(List<? extends String> list) {
            //list.add("Hello World!");
            System.out.println(list.get(0));
        }
    }

    public static class Util {
        public static <T> T getValue(Object obj, Class<T> clazz) {
            return (T) obj;
        }
        public static <T> T getValue(Object obj) {
            return (T) obj;
        }
    }

    public static class NumberContainer<T extends Number> {
        private T number;

        public NumberContainer(T number)  { this.number = number; }

        public void print() {
            System.out.println(number);
        }

        public T getNumber() {
            return number;
        }

        public void setNumber(T number) {
            this.number = number;
        }
    }
}
