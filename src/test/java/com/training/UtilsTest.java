package com.training;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Opleiding on 18/05/2017.
 */
import org.junit.*;
import sun.plugin2.liveconnect.JSExceptions;

import static org.junit.Assert.*;

public class UtilsTest {

    @Test
    public void test() throws MyException {
        Integer nb = new Integer(15);
        nb = null;
        List<Integer> numbersNew = null;
        numbersNew.add(5);
        numbersNew.add(null);
        try {
            int total = Utils.add(numbersNew);
        } catch (NullPointerException e){
            throw new MyException("Anything that you want");
        }
        System.out.println("continue...");
        //Assert.assertEquals(5, total);
    }
    @Test
    public void testMikeMethod()throws Exception{
        String test ="";
        int result = Utils.mikeMethod(test);
        assertEquals("Result should be 15",15,result);
    }


}
