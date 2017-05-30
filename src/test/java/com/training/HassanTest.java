package com.training;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by hassan on 18/05/2017.
 */
public class HassanTest {

    @Test
    public void addTwoNumberTest(){
        int add = Utils.add(5, 5);
        assertSame("total is ok", 10 , add);
    }

    @Test
    public void addFiveNumbersTest(){
        int add = Utils.add(3, 3, 3, 3, 3);
        assertSame(15, add);
    }

}
