package links.java.generics.g02;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

//public class SomeType<T> {
public class SomeType {

    public <E> void test(Collection<E> collection) {
        for (E e : collection) {
            System.out.println(e);
        }
    }

    public void test(List<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    public static void main(String[] args) {
        //SomeType<String> someType = new SomeType<>();
        //SomeType someType = new SomeType<>();
        //SomeType someType = new SomeType<String>();
        SomeType someType = new SomeType();

        List<String> stringList = Arrays.asList("value");
        someType.test(stringList);
    }
}
