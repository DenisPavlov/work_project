package links.java8;

import links.java.clone.User;

import java.util.Optional;

public class Opt {
    public static void main(String[] args) {
        Optional<User> user = Optional.empty();

        System.out.println(user.get());
     }
}
