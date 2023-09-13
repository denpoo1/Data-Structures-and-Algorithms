package org.example.DataStructures.BinaryTree;

public class MyBinaryTree {
    private Node root;
    private int height;
    private int quantityNodes;

    public void insert(int item) {
        int height = 0;
        if (quantityNodes == 0) {
            root = new Node(null, null, item, 0);
            quantityNodes++;
            return;
        }
        quantityNodes++;
        Node element = root;
        while (true) {
            height++;
            if (item > element.getItem()) {
                if (element.getRight() == null) {
                    element.setRight(new Node(null, null, item, 0));
                    if (this.height < height) this.height = height;
                    break;
                }
                element = element.getRight();
            } else if (item < element.getItem()) {
                if (element.getLeft() == null) {
                    element.setLeft(new Node(null, null, item, 0));
                    if (this.height < height) this.height = height;
                    break;
                }
                element = element.getLeft();
            } else if (item == element.getItem()) {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public void remove(int item) {
        int height = 0;
        if (quantityNodes == 1) {
            root = new Node(null, null, 0, 0);
            quantityNodes--;
            return;
        }
        Node element = root;
        while (true) {
            height++;
            if (item > element.getItem()) {
                if (element.getRight().getItem() == item) {
                    Node leftBranch = element.getRight().getLeft();
                    Node rightBranch = element.getRight().getRight();
                    Node lastLeftNodeInRightBranch = searchLastLeftNode(rightBranch);
                    lastLeftNodeInRightBranch.setLeft(leftBranch);
                    element = rightBranch;
                    quantityNodes--;
                    break;
                }
                element = element.getRight();
            } else if (item < element.getItem()) {
                if (element.getLeft().getItem() == item) {
                    Node leftBranch = element.getLeft().getLeft();
                    Node rightBranch = element.getLeft().getRight();
                    Node lastLeftNodeInRightBranch = searchLastLeftNode(rightBranch);
                    lastLeftNodeInRightBranch.setLeft(leftBranch);
                    element = rightBranch;
                    quantityNodes--;
                    break;
                }
                element = element.getLeft();
            }
        }
        // не забывать про quantityNodes--
    }

    private Node searchLastLeftNode(Node node) {
        if (node.getLeft() == null) return node;
        Node newNode = node.getLeft();
        while (true) {
            if (newNode.getLeft() == null) return newNode;
            newNode = newNode.getLeft();
        }
    }

    public MyBinaryTree() {
        height = 0;
        quantityNodes = 0;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getQuantityNodes() {
        return quantityNodes;
    }

    public void setQuantityNodes(int quantityNodes) {
        this.quantityNodes = quantityNodes;
    }
}

/*
 * todo Удаление (Deletion) доделать
 * */