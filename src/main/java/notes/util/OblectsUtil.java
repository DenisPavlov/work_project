package notes.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OblectsUtil {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Symon", 3);
        Cat cat2 = new Cat("Symon", 3);
        Cat cat3 = null;

//        System.out.println(cat1 == cat2);
//        System.out.println(cat1.equals(cat2));
//        System.out.println(Objects.deepEquals(cat1, cat2));
//        System.out.println(Objects.equals(cat1, cat2));
//        System.out.println(Objects.hash(cat1, cat2));
//        System.out.println(Objects.toString(cat3, "Значение равно NULL"));
//        System.out.println(Objects.toString(cat2));

        String s = "Hello";
        String ss = new String(s);
        System.out.println(ss.equals(s));

        List<String> stringList = new ArrayList<>();
        Stream<String> stream = stringList.stream().filter(f -> f.contains("a"));
        String list = stream.collect(Collectors.joining(", "));

        stream.filter(f -> f.contains("b")).collect(Collectors.toList());


    }

}
