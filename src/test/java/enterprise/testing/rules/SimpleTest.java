package enterprise.testing.rules;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SimpleTest {
    @Before
    public void before() {
        System.out.println("before");
    }

    @After
    public void after() {
        System.out.println("after");
    }

    @Test
    public void test() {
        System.out.println("test");
        throw new RuntimeException();
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }
}
