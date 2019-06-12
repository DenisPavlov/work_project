import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.putIfAbsent("x", null);
        System.out.print(map.getOrDefault("x", "1"));
        map.putIfAbsent("x", "2");
        System.out.print(map.getOrDefault("x", "3"));
    }
}
