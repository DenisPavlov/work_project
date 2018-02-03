package answers.core.stackAndHeap;

import java.util.ArrayList;
import java.util.List;

public class MemoryError {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        while (true) {
            Object o = new Long("999999999999999999");
            list.add(o);
            System.out.println(list.size());
        }
    }
}
