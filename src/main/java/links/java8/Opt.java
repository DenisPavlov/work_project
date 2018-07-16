package links.java8;

import links.java.clone.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static javax.swing.UIManager.put;

public class Opt {
    Map<String, String> map = new HashMap<String, String>() {{
        put("паук",  "арахнид");
        put("птица", "архозавр");
        put("кит",   "зверь");
    }};

    Map<String, String> map1 = new HashMap<String, String>() {{}};

    public static void main(String[] args) {
//        Optional<User> user = Optional.empty();
//
//        System.out.println(user.get());

        Opt opt = new Opt();
        System.out.println(opt.map);
     }


}
