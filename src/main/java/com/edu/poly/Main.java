package com.edu.poly;

import com.edu.poly.service.MyBigNumber;

public class Main {
    public static void main(String[] args) {
        MyBigNumber myBigNumber = new MyBigNumber();
        String result = myBigNumber.sum("792384", "39"); //792423
    }
}