package com.company;



public class Main {

    public static void main(String[] args) {
       /* Sumator sumator=new Sumator();
        System.out.println(sumator.sum(12,12));
        System.out.println(sumator.sum(2.5,2.5));
        System.out.println(sumator.sum("a","b"));
        System.out.println(sumator.sum(123456789,123456780));
        System.out.println(sumator.sum(1.22222222222,1.2222222222));
        System.out.println((sumator.sum(null,"b"))); */


        BinaryTree tree=new BinaryTree(3);
        tree.addNode(55);
        tree.addNode(44);
        tree.addNode(98);


        tree.sort();
        System.out.println(tree.search(98));
        System.out.println(tree.search(97));


    }
}
