package tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);

        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testFrankMultiplication() {
        Frank five = new Frank(5);

        assertEquals(new Frank(10), five.times(2));
        assertEquals(new Frank(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));

        assertTrue(new Frank(5).equals(new Frank(5)));
        assertFalse(new Frank(5).equals(new Frank(6)));
    }
}
