package links.java8;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.of(1, 2, 3).forEach(x -> System.out.print(x + " "));
        System.out.println("");
        IntStream.rangeClosed(1,10).forEach(x -> System.out.print(x + " "));
        System.out.println("");
        IntStream.range(1,10).forEach(x -> System.out.print(x + " "));
        System.out.println();
        IntStream.iterate(0, i -> i + 2).limit(3).forEach(x -> System.out.print(x + " "));
    }
}
