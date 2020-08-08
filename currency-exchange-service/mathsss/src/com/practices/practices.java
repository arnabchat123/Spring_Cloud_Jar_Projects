package com.practices;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class practices {


    public static void main(String args[]) {
        Double db1 = 0.3d;
        Double db2 = 0.2d;
        BigDecimal bd3 = new BigDecimal("0.2");
        BigDecimal bd4 = new BigDecimal("0.3");
        //System.out.println("BigDec:\t 20 / 3 = " + (bd3.divide(bd4,4, RoundingMode.HALF_UP)));
        System.out.println("value of double = " +(db1-db2));
        System.out.println("value of BigDecimal = " +bd4.subtract(bd3));
    }
}
