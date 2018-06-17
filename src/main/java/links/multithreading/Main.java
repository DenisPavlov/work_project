package links.multithreading;

import java.util.Collection;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
//        Node root = getRootNode();
//        new ForkJoinPool().invoke(new ValueSumCounter(root));
        long t0 = System.currentTimeMillis();
        double d0 = 0;
        double d1 = 0;
        double d2 = 0;
        double d3 = 0;
        double d4 = 0;
        double d5 = 0;
        double d6 = 0;
        double d7 = 0;
        double d8 = 0;
        double d9 = 0;
        double d10 = 0;
        double d11 = 0;
        double d12 = 0;
        double d13 = 0;
        double d14 = 0;
        double d15 = 0;
        for (int k = 0; k < 100_000_000; k++) {
            d0 = d0 * d0;
            d1 = d1 * d1;
            d2 = d2 * d2;
            d3 = d3 * d3;
            d4 = d4 * d4;
            d5 = d5 * d5;
            d6 = d6 * d6;
            d7 = d7 * d7;
            d8 = d8 * d8;
            d9 = d9 * d9;
//            d10 = d10 * d10;
//            d11 = d11 * d11;
//            d12 = d12 * d12;
//            d13 = d13 * d13;
//            d14 = d14 * d14;
//            d15 = d15 * d15;
//            d1 = d1 * d1;
        }
        System.out.println(System.currentTimeMillis() - t0);
    }

    private static Node getRootNode() {
        return new Node() {
            @Override
            public Collection<Node> getChildren() {

                return null;
            }

            @Override
            public long getValue() {
                return 0;
            }
        };
    }
}
