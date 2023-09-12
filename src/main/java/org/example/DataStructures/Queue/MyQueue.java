package org.example.DataStructures.Queue;

import org.example.DataStructures.LinkedList.Node;

public class MyQueue<E> {

    private int size;
    private org.example.DataStructures.LinkedList.Node<E> first;
    private org.example.DataStructures.LinkedList.Node<E> last;

    public void add(E item) {
        if (size == 0) {
            org.example.DataStructures.LinkedList.Node<E> newElement = new org.example.DataStructures.LinkedList.Node<>(item, null, null);
            first = newElement;
            last = newElement;
        } else if(size == 1) {
            last = new org.example.DataStructures.LinkedList.Node<>(item, null, first);
            first.setNext(last);
        } else{
            org.example.DataStructures.LinkedList.Node<E> newElement = new org.example.DataStructures.LinkedList.Node<>(item, null, last);
            last.setNext(newElement);
            last = newElement;
        }
        size++;
    }

    public String remowe() {
        if(size > 1) {
            String lastString = first.getItem().toString();
            Node<E> newFirstNode = first.getNext();
            newFirstNode.setPrev(null);
            first = newFirstNode;
            size--;
            return lastString;
        } else if (size == 1) {
            String lastString = first.getItem().toString();
            first = last;
            size--;
            return lastString;
        } else if(size == 0){
            return "stack empty";
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public String peak() {
        return first.getItem().toString();
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
