package org.example;

public class Bulldozer extends Machine {
    public void doWork() {
        System.out.println("Truck has started working.");
    }

    @Override
    public void stopWork() {
        System.out.println("Truck has stopped working.");
    }
}
