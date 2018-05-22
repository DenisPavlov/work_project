package tasks;

import java.util.List;

/**
 * public class App {
 * public <A extends Comparable<B> & List<? super Integer>, B extends Comparable<A>> void func(A a, B b) {
 * a.add(a.compareTo(b) + b.compareTo(a));
 *  }
 * }
 */

public class Gen {
    public <A extends Comparable<B> & List<? super Integer>, B extends Comparable<A>> void func(A a, B b) {
        a.add(a.compareTo(b) + b.compareTo(a));
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}