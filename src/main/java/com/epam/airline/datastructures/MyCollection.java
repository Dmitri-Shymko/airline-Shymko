package com.epam.airline.datastructures;

public interface MyCollection<E> {
    int size();

    boolean add(E obj);

    boolean remove(E obj);

    boolean contains(E obj);

    E get(int index);

    E[] toArray(Class<E> clazz);
}
