/*
 * Written by Steven Yeoh
 *
 * Copyright (c) 2019.
 */

package sy.time.converter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestConverter
{
    @Test
    public void test_30_seconds()
    {
        String result = Converter.bySeconds(30);
        assertEquals("30 seconds", result);
    }

    @Test
    public void test_60_seconds()
    {
        String result = Converter.bySeconds(60);
        assertEquals("1 minute", result);
    }

    @Test
    public void test_90_seconds()
    {
        String result = Converter.bySeconds(90);
        assertEquals("1 minute 30 seconds", result);
    }

    @Test
    public void test_150_seconds()
    {
        String result = Converter.bySeconds(150);
        assertEquals("2 minutes 30 seconds", result);
    }

    @Test
    public void test_3600_seconds()
    {
        String result = Converter.bySeconds(3600);
        assertEquals("1 hour", result);
    }

    @Test
    public void test_5400_seconds()
    {
        String result = Converter.bySeconds(5400);
        assertEquals("1 hour 30 minutes", result);
    }

    @Test
    public void test_9108_seconds()
    {
        String result = Converter.bySeconds(9108);
        assertEquals("2 hours 31 minutes 48 seconds", result);
    }

    @Test
    public void test_32_minutes()
    {
        String result = Converter.byMinutes(32);
        assertEquals("32 minutes", result);
    }

    @Test
    public void test_32_minutes_30_seconds()
    {
        String result = Converter.byMinutes(32.50);
        assertEquals("32 minutes 30 seconds", result);
    }

    @Test
    public void test_60_minutes()
    {
        String result = Converter.byMinutes(60);
        assertEquals("1 hour", result);
    }

    @Test
    public void test_120_minutes_40_seconds()
    {
        String result = Converter.byMinutes(120.67);
        assertEquals("2 hours 40 seconds", result);
    }

    @Test
    public void test_2_hours_41_seconds()
    {
        String result = Converter.byMinutes(120.68);
        assertEquals("2 hours 41 seconds", result);
    }

    @Test
    public void test_125_minutes_40_seconds()
    {
        String result = Converter.byMinutes(125.67);
        assertEquals("2 hours 5 minutes 40 seconds", result);
    }

    @Test
    public void test_1_hour()
    {
        String result = Converter.byHours(1);
        assertEquals("1 hour", result);
    }

    @Test
    public void test_1_and_a_half_hour()
    {
        String result = Converter.byHours(1.5);
        assertEquals("1 hour 30 minutes", result);
    }

    @Test
    public void test_2_hours()
    {
        String result = Converter.byHours(2);
        assertEquals("2 hours", result);
    }

    @Test
    public void test_2_and_a_half_hours_40_seconds()
    {
        String result = Converter.byHours(2.511);
        assertEquals("2 hours 30 minutes 40 seconds", result);
    }

    @Test
    public void test_3_hours_48_minutes_30_seconds()
    {
        String result = Converter.byHours(3.8084);
        assertEquals("3 hours 48 minutes 30 seconds", result);
    }

    @Test
    public void test_5_hours_59_minutes_59_seconds()
    {
        String result = Converter.byHours(5.9996);
        assertEquals("5 hours 59 minutes 59 seconds", result);
    }

    @Test
    public void test_24_hours()
    {
        String result = Converter.byHours(24);
        assertEquals("24 hours", result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void test_24_hours_6_minutes()
    {
        String result = Converter.byHours(24.1);
        assertEquals("converter does not support day(s)", result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void test_25_hours()
    {
        String result = Converter.byHours(25);
        assertEquals("converter does not support day(s)", result);
    }
}
