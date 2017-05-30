package com.training;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Mustafa on 5/18/2017.
 */
public class MustafaTest {

    @Test
    public void testAdd(){
        int actual = Utils.add(5,3,2,10,4,1);
        assertEquals(25,actual);
    }

    @Test
    public void testAddNotCorrect(){
        int actual = Utils.add(5,3,10,4,1);
        assertNotEquals(actual,25);
    }
}
