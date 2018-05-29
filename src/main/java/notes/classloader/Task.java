package notes.classloader;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {
        String s = "Hello world";
        System.out.println(s);

        ArrayList list = new ArrayList();
        System.out.println(ArrayList.class);
        System.out.println(Task.class.getClassLoader());
    }
}
