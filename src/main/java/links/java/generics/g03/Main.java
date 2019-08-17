package links.java.generics.g03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    static void print(Collection<String> collection) {
        for (String s : collection) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>();

        print(stringList);
        //print(objectList);
    }
}
