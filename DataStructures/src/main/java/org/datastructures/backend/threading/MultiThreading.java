package org.datastructures.backend.threading;

public class MultiThreading extends Thread {

    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("Extends Thread - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread is finished");
    }
}
