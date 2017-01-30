package com.company;

/**
 * Created by Dido on 30.01.17.
 */
public class BinaryTree {
    /**
     *Fields
     */
    private int data;
    private BinaryTree left;
    private BinaryTree right;

    /**
     * Constructor
     */
    public BinaryTree(int num) {
        this.data = num;
        this.left = null;
        this.right = null;
    }

    /**
     * Add node to the tree
     * @param num is the value of the node
     */
    public void addNode(int num) {
        {
            if (num < this.data) {
                if (this.left != null) {
                    this.left.addNode(num);
                } else {
                    this.left = new BinaryTree(num);
                }

            } else {
                if (this.right != null) {
                    this.right.addNode(num);
                } else {
                    this.right = new BinaryTree(num);
                }

            }
        }
    }

    /**
     * Sort the tree with recursion
     */
    public void sort() {
        if (this.left != null) {
            this.left.sort();
        }
        System.out.println(this.data);
        if (this.right != null) {
            this.right.sort();
        }
    }

    /**
     * Search in tree for an element
     * @param value is the element
     * @returns true if there is such an element otherwise returns false
     */
    public boolean search(int value) {
        if (value == this.data)
            return true;

        else if (value < this.data) {

            if (left == null)

                return false;

            else

                return left.search(value);

        } else if (value > this.data) {

            if (right == null)
                return false;
            else
                return right.search(value);

        }
        return false;

    }


}
