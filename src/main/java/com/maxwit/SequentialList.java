package com.maxwit;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class SequentialList<T> implements Iterable<T> {
    final static int LEN = 10;
    int size;
    Object[] arr;

    ArrayList arrayList = new ArrayList();

    public SequentialList() {
        size = 0;
        arr = new Object[LEN];
    }

    public boolean insert(T x) {
        if (size >= LEN) throw new ArrayIndexOutOfBoundsException();
        else arr[size++] = x;

        return true;
    }

    public void traversal(Consumer visit) {
        for (int i = 0; i < size; i++) {
            visit.accept(arr[i]);
        }
    }

    public boolean isEmpty() {
        if (size > 0) return false;
        return true;
    }

    public T get(int index) {
        if (index > LEN || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (T)arr[index];
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                return (T)arr[index++];
            }
        };
    }
}