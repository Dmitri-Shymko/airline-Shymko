package com.epam.airline.datastructures;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class MyDynamicArray<E> implements MyCollection<E> {
    private Object[] array = new Object[8];
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(E obj) {
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size++] = obj;
        return true;

    }

    @Override
    public boolean remove(E obj) {
        boolean isDelited = false;
        int initialNumber = size;
        for (int i = 0; i < initialNumber; i++) {
            if (!isDelited && array[i].equals(obj)) {
                array[i] = null;
                size--;
                isDelited = true;
            }
            if (isDelited && i < array.length - 1) {
                array[i] = array[i + 1];
            }
            if (isDelited && i == array.length - 1) {
                array[i] = null;
            }

        }
        return false;
    }

    @Override
    public boolean contains(E obj) {
        for (int i = 1; i < size; i++) {
            if (array[i].equals(obj)) {
                return true;
            }
        }
        return false;

    }

    @Override
    public E get(int index) {
        if (index > size) {
            return null;
        }
        return (E) array[index];
    }

    @Override
    public E[] toArray(Class<E> clazz) {
        E[] paramArray = (E[]) Array.newInstance(clazz, size);
        for (int i = 0; i < size; i++) {
            paramArray[i] = (E) array[i];
        }
        return paramArray;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.deepHashCode(array);
        result = prime * result + Objects.hash(size);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MyDynamicArray other = (MyDynamicArray) obj;
        return Arrays.deepEquals(array, other.array) && size == other.size;
    }

}
