package horstmann.v1ch06.lambda;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

import javax.swing.*;
import javax.swing.Timer;

/**
 * This program demonstrates the use of lambda expressions.
 *
 * @author Cay Horstmann
 * @version 1.0 2015-05-12
 */
public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        BiFunction<String, String, Integer> comparator = (first, second) -> first.length() - second.length();
        Arrays.sort(planets, comparator::apply);

        Timer t = new Timer(1000, event -> System.out.println("The time is " + new Date()));
        t.start();

        MethodExample example = new MethodExample("Super Man");
        Function<MethodExample, String> stringFunction = MethodExample::getName;

        // keep program running until user selects "Ok"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class MethodExample {
    private String name;

   public MethodExample(String name) {
      this.name = name;
   }

   public String getName() {
        return this.name + name;
    }
}