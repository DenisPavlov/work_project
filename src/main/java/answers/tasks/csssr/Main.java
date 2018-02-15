package answers.tasks.csssr;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Character, List<String>> map = new TreeMap<>();

        String input = "сапог сарай арбуз болт бокс биржа";
        String[] strings = input.split(" ");

        for (String s : strings) {
            char c = s.charAt(0);
            List<String> list = map.get(c);
            if (list == null) list = new LinkedList<>(); //подумать над структурой

            list.add(s);
            map.put(c, list);
        }

        map.forEach((c, l) -> {
            l.sort(String::compareTo);
        });

        System.out.println(map.toString());

    }
}
