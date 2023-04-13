package com.mycompany.java.fundamentals.packageexamples;

// Note static keyword after import.

import static java.lang.System.*;

class StaticImportDemo {

    public static void main(String args[]) {
        // We don't need to use 'System.out'
        // as imported using static.
        out.println("GeeksforGeeks");
    }
}
