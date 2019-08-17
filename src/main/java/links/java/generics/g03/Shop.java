package links.java.generics.g03;

import java.util.List;

public class Shop {

    static void copy(List<? extends Product> producer, List<? super Product> consumer) {
        for (Product o : producer) {
            consumer.add(o);
        }
    }

    public static void main(String[] args) {
        Container<Product> productContainer = new Container<>();
        productContainer.setItem(new Camera());

    }
}
