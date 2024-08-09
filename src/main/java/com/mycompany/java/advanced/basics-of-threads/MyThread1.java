package com.mycompany.java.advanced.basicsofthreads;

public class MyThread1 implements Runnable {

    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MyThread1());
        t.start();
    }
}
