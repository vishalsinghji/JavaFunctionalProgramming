package DesignPatterns.IteratorDP;


import java.util.Arrays;
import java.util.function.Consumer;

public class MyArrayList<T> {
    private T[] elements;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public MyArrayList(int initialCapacity) {
        elements = (T[]) new Object[initialCapacity];
    }

    public MyArrayList() {
        this(10);  // default initial capacity
    }

    public void add(T element) {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = element;
    }

    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }

    public int size() {
        return size;
    }

    public void forEach(Consumer<T> action) {
        for (int i = 0; i < size; i++) {
            action.accept(elements[i]);
        }
    }
}
