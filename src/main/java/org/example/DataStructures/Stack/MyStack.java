package org.example.DataStructures.Stack;

import org.example.DataStructures.LinkedList.Node;

public class MyStack<E> {

    private int size;
    private org.example.DataStructures.LinkedList.Node<E> first;
    private org.example.DataStructures.LinkedList.Node<E> last;

    public void push(E item) {
        if (size == 0) {
            Node<E> newElement = new Node<>(item, null, null);
            first = newElement;
            last = newElement;
        } else if(size == 1) {
            last = new org.example.DataStructures.LinkedList.Node<>(item, null, first);
            first.setNext(last);
        } else{
            org.example.DataStructures.LinkedList.Node<E> newElement = new Node<>(item, null, last);
            last.setNext(newElement);
            last = newElement;
        }
        size++;
    }

    public String pop() {
        if(size > 1) {
            String lastString = last.getItem().toString();
            Node<E> newLastNode = last.getPrev();
            newLastNode.setNext(null);
            last = newLastNode;
            size--;
            return lastString;
        } else if (size == 1) {
            String lastString = last.getItem().toString();
            last = first;
            size--;
            return lastString;
        } else if(size == 0){
            return "stack empty";
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public String peak() {
        return last.getItem().toString();
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "size=" + size +
                ", first=" + first +
                ", last=" + last +
                '}';
    }
}
