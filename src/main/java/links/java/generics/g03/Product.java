package links.java.generics.g03;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

abstract class Product<T extends Product<T>> implements Comparable<T> {
    String name;
    double price;

    abstract int subCompare(@NotNull T product);

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(@NotNull Product product) {
        return Comparator.comparingDouble((ToDoubleFunction<Product>) Product::getPrice)
                .compare(this, product);
    }
}