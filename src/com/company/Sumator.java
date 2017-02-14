package com.company;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by Dido on 25.01.17.
 */
public class Sumator {

    /**
     * Sum two int numbers
     * @param a is the first number
     * @param b is the second number
     * @return the result of the operation
     */
      public int sum(int a,int b) {
        int result=a+b;
        return result;
      }

    /**
     *Sum two double numbers
     * @param a is the first double number
     * @param b is the second double number
     * @return the result of the double numbers sum
     */
        public double sum (double a, double b){
         double result=a+b;
         return result;
        }


    /**
     *Concanate two strings
     * @param a is the first string
     * @param b is the second string
     * @return the result of the two strings
     */
       public String sum (String a , String b){
        String result=a+b;
        return result;
       }


    /**
     * Return the result two Big integer numbers
     * @param a is the first number
     * @param b is the second number
     * @return the result of the sum
     */
        public BigInteger sum(BigInteger a, BigInteger b){
           BigInteger result= a.add(b);
           return result;
        }


        /**
     * Returns the sum of two decimal numbers
     * @param a is the first decimal number
     * @param b is the second decimal number
     * @return the result of the sum
     */
        public BigDecimal sum(BigDecimal a , BigDecimal b){
            BigDecimal result=a.add(b);
            return result;
        }








}
