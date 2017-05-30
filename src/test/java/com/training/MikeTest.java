package com.training;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by Mschneider on 18-05-17.
 */
public class MikeTest {

    @Test
    public void testAddTwoPositif() {
        int total = Utils.add(5,7);
        assertEquals("Addition with 2 positif not right", 12, total);
    }

    @Test
    public void testAddTwoNegatif() {
        int total = Utils.add(-5,-7);
        assertEquals("Addition with 2 positif not right", -12, total);
    }

    @Test
    public void testAddOnePositifAndOneNegatif() {
        int total = Utils.add(-5,8);
        assertEquals("Addition with 2 positif not right", 3, total);
    }

    @Test
    public void testAddOneZeroAndOnePositif() {
        int total = Utils.add(0,8);
        assertEquals("Addition with 2 positif not right", 8, total);
    }
}
