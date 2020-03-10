package org.tgm.collections;

import java.util.*;

public class ArrayList<T> implements List<T> {

    private int count = 0;
    private static final int DEFAULT_SIZE = 10;
    private Object[] array = new Object[DEFAULT_SIZE];

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        // Check if array has free space
        // if not put the data into the first empty index.
        //  and increment the count
        //if arr is fill increase the size of array by doubling it. copy old array into new array.
        // increment the count
        if (count >= array.length) {
            this.array = Arrays.copyOf(array, array.length *2);
        }
        array[count++] = t;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (array[i] == o) {
                array[i] = array[i+1];
                count--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {
        //create new array of double size
        // copy old into new array
        // then add element

        if (index >= array.length) {
            this.array = Arrays.copyOf(array, array.length*2);
        }
        array[index] = element;
        count++;

    }

    @Override
    public T remove(int index) {
        if (index < size()) {
            T temp = null;
            temp = (T) array[index];
            while (index < size()) {
                array[index] = array[index + 1];
                index++;
            }
            count--;
            return temp;
        } else {
            throw new IndexOutOfBoundsException("given index is not exist.");
        }

    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
