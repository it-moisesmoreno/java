package com.mycompany.java.fundamentals.opp.polymorphism;

class Bike {

    int speedlimit = 90;

    void getSpeedLimit() {
        System.out.println("The speedlimit of the Honda2 is " + speedlimit);
    }
}

class Honda3 extends Bike {

    int speedlimit = 150;

    void getSpeedLimit() {
        System.out.println("The speedlimit of the Honda2 is " + speedlimit);
    }

    public static void main(String args[]) {
        Bike obj = new Honda3();
        System.out.println(obj.speedlimit);//90  
        obj.getSpeedLimit();
    }
}
