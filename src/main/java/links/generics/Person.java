package links.generics;

import java.util.stream.Stream;

public class Person implements Comparable<Person> {
    private String name;

    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.name);
    }

    public static void main(String[] args) {
        Stream.of(Person.class.getDeclaredMethods()).forEach(System.out::println);
    }
}
