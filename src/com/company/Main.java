package com.company;



public class Main {

    public static void main(String[] args) {
        Sumator test=new Sumator();
        System.out.println(test.sum(12,12));
        System.out.println(test.sum(2.5,2.5));
        System.out.println(test.sum("a","b"));
        System.out.println(test.sum(123456789,123456780));
        System.out.println(test.sum(1.22222222222,1.2222222222));
    }
}
