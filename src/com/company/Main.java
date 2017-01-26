package com.company;



public class Main {

    public static void main(String[] args) {
        Sumator sumator=new Sumator();
        System.out.println(sumator.sum(12,12));
        System.out.println(sumator.sum(2.5,2.5));
        System.out.println(sumator.sum("a","b"));
        System.out.println(sumator.sum(123456789,123456780));
        System.out.println(sumator.sum(1.22222222222,1.2222222222));
    }
}
