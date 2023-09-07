package org.example.DataStructures.DynamicArrays;

import java.util.Arrays;

public class MyArrayList {
        private int size;
        private final int DEFAULT_CAPACITY = 10;
        private Object[] objects;
        private int countElements;

        private int index;

        private final int INCREASES = 20;

        public MyArrayList() {
            objects = new Object[DEFAULT_CAPACITY];
            size = DEFAULT_CAPACITY;
            countElements = 0;
            index = 0;
        }

        public MyArrayList(int size) {
            objects = new Object[size];
            this.size = size;
            countElements = 0;
            index = 0;
        }

        public void add(Object object) {
            if (isSpaceAvailable()) {
                objects[index++] = object;
            } else {
                Object[] objects1 = expandArray(objects);
                objects = objects1;
                objects[index++] = object;
            }
            countElements++;
        }

        public Object get(int index) {
            if (index >= 0 && index <= objects.length - 1) {
                return objects[index];
            }
            return "no such index in array";
        }

        public void remove(int index) {
            if (index >= 0 && index <= objects.length - 1) {
                objects[index] = null;
                offsetCopying(index);
            }
            countElements--;
        }

        public int search(Object object) {
            for (int x = 0; x < objects.length; x++) {
                if (objects[x].equals(object)) {
                    return x;
                }
            }
            return -1;
        }

        private boolean isSpaceAvailable() {
            return countElements + 1 <= size;
        }

        private Object[] expandArray(Object[] array) {
            int newSize = array.length + INCREASES;
            size = newSize;
            return Arrays.copyOf(array, newSize);
        }

        private void offsetCopying(int index) {
            for (int x = index; x < objects.length - 1; x++) {
                objects[x] = objects[x + 1];
            }
        }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "size=" + size +
                ", DEFAULT_CAPACITY=" + DEFAULT_CAPACITY +
                ", objects=" + Arrays.toString(objects) +
                ", countElements=" + countElements +
                ", index=" + index +
                ", INCREASES=" + INCREASES +
                '}';
    }
}
