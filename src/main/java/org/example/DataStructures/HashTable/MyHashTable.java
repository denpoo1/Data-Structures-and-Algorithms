package org.example.DataStructures.HashTable;

import java.util.LinkedList;
import java.util.Map;

public class MyHashTable<T1, T2> {

    private T1 key;
    private T2 value;

    private final int DEFAULT_SIZE_ARRAY = 10;

    private int capacity;
    private LinkedList<Map.Entry<T1, T2>>[] table;

    public MyHashTable(T1 key, T2 value) {
        this.key = key;
        this.value = value;
        capacity = DEFAULT_SIZE_ARRAY;
        table = new LinkedList[capacity];
        for (int x = 0; x < capacity; x++) {
            table[x] = new LinkedList<>();
        }
    }

    public T1 getKey() {
        return key;
    }

    public void setKey(T1 key) {
        this.key = key;
    }

    public T2 getValue() {
        return value;
    }

    public void setValue(T2 value) {
        this.value = value;
    }

    public void put(T1 key, T2 value) {
        int index = getIndex(key);
        LinkedList<Map.Entry<T1, T2>> bucket = table[index];

        for (Map.Entry<T1, T2> entry : bucket) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        bucket.add(Map.entry(key, value));
    }

    public T2 get(T1 key) {
        int index = getIndex(key);
        LinkedList<Map.Entry<T1, T2>> bucket = table[index];

        for (Map.Entry<T1, T2> entry : bucket) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void remove(T1 key) {
        int index = getIndex(key);
        LinkedList<Map.Entry<T1, T2>> bucket = table[index];

        for (Map.Entry<T1, T2> entry : bucket) {
            if (entry.getKey().equals(key)) {
                bucket.remove(entry);
                return;
            }
        }
    }



    private int getIndex(Object key) {
        return key.hashCode() % capacity;
    }

    public Object get(int index) {
        return null;
    }
}
