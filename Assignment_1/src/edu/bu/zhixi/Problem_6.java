package edu.bu.zhixi;

import java.util.ArrayList;
import java.util.List;

// use BigInteger to present number with more than 20 bits
// https://docs.oracle.com/javase/6/docs/api/java/math/BigInteger.html
import java.math.BigInteger;

public class Problem_6 {

    /*
        a function that computes the list of the first 100 Fibonacci numbers
     */

    public static void main(String[] args) {
        List<String> first100FIB = first100Fib();
        System.out.println(first100FIB);
    }

    public static List<String> first100Fib() {
        List<String> result = new ArrayList<>();
        BigInteger nMinus2th = BigInteger.valueOf(1);
        BigInteger nMinus1th = BigInteger.valueOf(1);
        BigInteger nth = BigInteger.valueOf(0);
        result.add(nMinus2th+"");
        result.add(nMinus1th+"");
        for (int i = 2; i <= 100; i++) {
            nth = nth.add(nMinus2th);
            nth = nth.add(nMinus1th);
            result.add(nMinus2th + "+" + nMinus1th + "=" + nth);
            nMinus2th = nMinus1th;
            nMinus1th = nth;
            nth = BigInteger.valueOf(0);
        }
        return result;
    }
}
