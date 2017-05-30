package com.training;

import java.util.List;

/**
 * Created by hassan on 18/05/2017.
 */
public class Utils {
    public static int add(int... numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            Integer transform = new Integer(numbers[i]);
            if (transform == null) {
                transform = 0;
            }
            result += transform;
        }
        return result;
    }

    public static int add(List<Integer> numbers) {
        int result = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) != null) {
                result += numbers.get(i);
            }
        }
        return result;
    }

    public static int mikeMethod(String input) throws MyException {
        try {
            if (input != null) {
                return Integer.parseInt(input);
            } else {
                throw new MyException("Please enter a value");
            }
        } catch (NumberFormatException e) {
            throw new MyException("Enter a number");
        }

    }
}

