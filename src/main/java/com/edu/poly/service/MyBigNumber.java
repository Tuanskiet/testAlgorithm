package com.edu.poly.service;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class MyBigNumber {
    private final Logger LOGGER = Logger.getLogger(MyBigNumber.class.getName());

    public String sum(String stn1, String stn2) {
        int length1 = stn1.length();
        int length2 = stn2.length();
        int maxLength = Math.max(length1, length2);

        LinkedList<Integer> result = new LinkedList();
        int temp = 0;

        for (int i = 0; i < maxLength; i++) {
            int num1 = (i < length1) ? Character.getNumericValue(stn1.charAt(length1 - 1 - i)) : 0;
            int num2 = (i < length2) ? Character.getNumericValue(stn2.charAt(length2 - 1 - i)) : 0;

            int sum = num1 + num2 + temp;
            temp = sum / 10;
            result.addFirst(sum % 10);

            LOGGER.info("::Step "+(i + 1)+" : "+ num1 +" + "+ num2 +" = "
                    + sum +", save = "+ (sum % 10) +", temp = "+ temp);
        }

        if (temp > 0) {
            result.addFirst(temp);
        }
        String resultString = result.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
        LOGGER.info(":::Result : " + resultString);
        return resultString;
    }
}
