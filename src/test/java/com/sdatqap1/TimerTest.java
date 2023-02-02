package com.sdatqap1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimerTest {
    @Test
    public void testGetHour() {
        Timer timer = new Timer(12, 30, 45);
        int expected = 12;
        int actual = timer.getHour();
        assertEquals(expected, actual);
        System.out.println("Test getHour() passed");
    }

    @Test
    public void testGetMinute() {
        Timer timer = new Timer(12, 30, 45);
        int expected = 30;
        int actual = timer.getMinute();
        assertEquals(expected, actual);
        System.out.println("Test getMinute() passed");
    }

    @Test
    public void testGetSecond() {
        Timer timer = new Timer(12, 30, 45);
        int expected = 45;
        int actual = timer.getSecond();
        assertEquals(expected, actual);
        System.out.println("Test getSecond() passed");
    }

    @Test
    public void testSetHour() {
        Timer timer = new Timer(12, 30, 45);
        timer.setHour(15);
        int expected = 15;
        int actual = timer.getHour();
        assertEquals(expected, actual);
        System.out.println("Test setHour() passed");
    }

    @Test
    public void testSetMinute() {
        Timer timer = new Timer(12, 30, 45);
        timer.setMinute(35);
        int expected = 35;
        int actual = timer.getMinute();
        assertEquals(expected, actual);
        System.out.println("Test setMinute() passed");
    }

    @Test
    public void testSetSecond() {
        Timer timer = new Timer(12, 30, 45);
        timer.setSecond(25);
        int expected = 25;
        int actual = timer.getSecond();
        assertEquals(expected, actual);
        System.out.println("Test setSecond() passed");
    }

    @Test
    public void testSetTime() {
        Timer timer = new Timer(00, 00, 00);
        timer.setTime(12, 30, 25);
        int expectedHour = 12;
        int actualHour = timer.getHour();
        assertEquals(expectedHour, actualHour);
        System.out.println("Test setHour() passed");

        int expectedMinute = 30;
        int actualMinute = timer.getMinute();
        assertEquals(expectedMinute, actualMinute);

        int expectedSecond = 25;
        int actualSecond = timer.getSecond();
        assertEquals(expectedSecond, actualSecond);
        System.out.println("Test setTime() passed");
    }

    @Test
    public void testToString() {
        Timer timer = new Timer(12, 30, 25);
        String expected = "12:30:25";
        String actual = timer.toString();
        assertEquals(expected, actual);
        System.out.println("Test toString() passed");
    }

    @Test
    public void testNextSecond() {
        Timer timer = new Timer(23, 59, 59);
        timer.nextSecond();
        String expected = "00:00:00";
        String actual = timer.toString();
        assertEquals(expected, actual);
        System.out.println("Test nextSecond() passed");
    }

    @Test
    public void testPreviousSecond() {
        Timer timer = new Timer(00, 00, 00);
        timer.previousSecond();
        String expected = "23:59:59";
        String actual = timer.toString();
        assertEquals(expected, actual);
        System.out.println("Test previousSecond() passed");
    }
}
