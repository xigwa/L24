package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testTask1() {
        assertEquals(5, Main.task1("This is a test sentence"));
        assertEquals(1, Main.task1("Hello"));
        assertEquals(0, Main.task1(""));
        assertEquals(3, Main.task1("Hello world again"));
        assertEquals(2, Main.task1("  Two spaces  "));
    }

    @Test
    public void testTask2() {
        assertEquals("tset", Main.task2("test"));
        assertEquals("avaJ", Main.task2("Java"));
        assertEquals("", Main.task2(""));
        assertEquals("a", Main.task2("a"));
        assertEquals("987654321", Main.task2("123456789"));
    }

    @Test
    public void testTask3() {
        assertEquals(7, Main.task3("This is a test sentence"));
        assertEquals(2, Main.task3("Hello"));
        assertEquals(0, Main.task3("bcdfghjklmnpqrstvwxyz"));
        assertEquals(0, Main.task3(""));
        assertEquals(5, Main.task3("AEIOU"));
    }

    @Test
    public void testTask4() {
        assertTrue(Main.task4("madam"));
        assertFalse(Main.task4("test"));
        assertTrue(Main.task4("a"));
        assertTrue(Main.task4(""));
        assertFalse(Main.task4("hello"));
    }

    @Test
    public void testTask5() {
        assertEquals("tes", Main.task5("test"));
        assertEquals("Helo", Main.task5("Hello"));
        assertEquals("", Main.task5(""));
        assertEquals("abcd", Main.task5("aabbccdd"));
        assertEquals("Jav", Main.task5("Java"));
    }
}
