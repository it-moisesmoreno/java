package com.mycompany.java.advanced.collectionframework;

import java.util.Iterator;

class CustomIterable<Type> implements Iterable<Type> {

    private Type[] arrayList;
    private int currentSize;

    public CustomIterable(Type[] newArray) {
        this.arrayList = newArray;
        this.currentSize = arrayList.length;
    }

    @Override
    public Iterator<Type> iterator() {
        Iterator<Type> it = new Iterator<Type>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < currentSize && arrayList[currentIndex] != null;
            }

            @Override
            public Type next() {
                return arrayList[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }
}

class Main {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1, 2, 3};
        CustomIterable<Integer> ci = new CustomIterable<Integer>(numbers);
    }
}
