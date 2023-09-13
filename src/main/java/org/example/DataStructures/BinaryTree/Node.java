package org.example.DataStructures.BinaryTree;

public class Node {
    private Node left;
    private Node right;
    private int item;
    private int quantity;

    public Node(Node left, Node right, int item, int quantity) {
        this.left = left;
        this.right = right;
        this.item = item;
        this.quantity = quantity;
    }

    public Node() {
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                '}';
    }
}
