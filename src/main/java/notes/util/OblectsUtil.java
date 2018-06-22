package notes.util;

import java.util.Objects;

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
        System.out.println(Objects.toString(cat3, "Значение равно NULL"));
        System.out.println(Objects.toString(cat2));
    }
}
