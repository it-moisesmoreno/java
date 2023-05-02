package com.mycompany.java.advanced.collectionframework;

import java.util.Iterator;

class CustomIterator<T> implements Iterator<Integer> {

    Integer[] tArray;

    // Checks if the next element exists
    public boolean hasNext() {
        return tArray.length > 0;
    }

    // moves the cursor/iterator to next element
    public Integer next() {
        return tArray[0];
    }

    // Used to remove an element. Implement only if needed
    public void remove() {

        if (tArray.length > 0) {
            tArray[2] = 0;
        }

        // Default throws UnsupportedOperationException.
    }

    public CustomIterator() {
        tArray = new Integer[]{1, 2, 3};
    }

    public static void main(String[] args) {
        CustomIterator<Integer> ci = new CustomIterator<Integer>();

        System.out.println("The iterator has next? " + ci.hasNext());
        System.out.println("The next element is " + ci.next());
        ci.remove();
        System.out.println("The las elements was removed!");

    }
}
