package enterprise.testing.rules;

import org.junit.Rule;
import org.junit.Test;

public class SimpleTest3 {

    private String ss;

    @Rule
    public SimpleRule rule = new SimpleRule();

    @Test
    public void test() {
        System.out.println("test");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }
}
