package links.java.generics.g03;

import org.jetbrains.annotations.NotNull;

public class Phone extends Product {
    String model;

    @Override
    int subCompare(@NotNull Product product) {
        return 0;
    }
}
