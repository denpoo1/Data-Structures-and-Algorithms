package org.example.DataStructures.LinkedList;

public class MyLinkedList<E> {
    private int size;
    private Node<E> first;
    private Node<E> last;

    public void add(E item) {
        if (size == 0) {
            Node<E> newElement = new Node<>(item, null, null);
            first = newElement;
            last = newElement;
        } else if(size == 1) {
            last = new Node<>(item, null, first);
            first.setNext(last);
        } else{
            Node<E> newElement = new Node<>(item, null, last);
            last.setNext(newElement);
            last = newElement;
        }
        size++;
    }

    public void remowe(E item) {
        Node<E> container = new Node<>(first.getItem(), first.getNext(), first.getPrev());
        for (int x = 1; x < size; x++) {
            if (container.getItem().equals(item)) {
                Node<E> next = container.getNext();
                Node<E> prev = container.getPrev();
                next.setPrev(prev);
                prev.setNext(next);
                size--;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public void remowe(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Индекс находится вне допустимых границ");
        }

        if (size == 1) {
            // Если у нас всего один элемент в списке, просто очистим список
            first = null;
            last = null;
        } else if (index == 0) {
            // Если удаляем первый элемент
            Node<E> next = first.getNext();
            next.setPrev(null);
            first = next;
        } else if (index == size - 1) {
            // Если удаляем последний элемент
            Node<E> prev = last.getPrev();
            prev.setNext(null);
            last = prev;
        } else {
            // Если удаляем элемент в середине списка
            Node<E> current = first;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }

            Node<E> next = current.getNext();
            Node<E> prev = current.getPrev();

            prev.setNext(next);
            next.setPrev(prev);
        }
        size--;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "size=" + size +
                ", first=" + first +
                ", last=" + last +
                '}';
    }
}
