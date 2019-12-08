package horstmann.v1ch09.experiments;

import java.util.*;

public class Example1 {
    // стр.419 книга 1 Хорстман, говорится о том, что в коллекцию недьзя добавить 2
    // одинаковых элемента
    // вывод, можно добавлять !!!
    public static void main(String[] args) {
        Person person = new Person(30, "Denis");
        Collection<Person> people = Arrays.asList(person, person, person);
        System.out.println(people.size()); //3

        Collection<Person> people1 = new ArrayList<>(people);
        people1.add(person);
        System.out.println(people1.size()); //4
    }

    private static class Person {
        private Integer age;
        private String name;

        public Person(Integer age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person person = (Person) o;
            return Objects.equals(age, person.age) &&
                    Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }
    }
}
