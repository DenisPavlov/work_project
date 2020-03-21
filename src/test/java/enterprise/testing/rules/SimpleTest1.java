package enterprise.testing.rules;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleTest1 {
    @BeforeClass
    public static void before() {
        System.out.println("before");
    }

    @AfterClass
    public static void after() {
        System.out.println("after");
    }

    @Test
    public void test() {
        System.out.println("test");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }
}
