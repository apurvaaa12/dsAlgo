package org.datastructures.backend.threading;

public class MultithreadingMain {

    public static void main(String[] args) throws InterruptedException {

        //can't have another class as parent
        MultiThreading thread = new MultiThreading();
        System.out.println(thread.isAlive());

        //second way of creating a thread
        //This is preferred
        // we can still use inheritance
        MyrunnableThread runnable1 = new MyrunnableThread();
        Thread thread2 = new Thread(runnable1);

        System.out.println(thread2.isAlive());

//        thread.start();
//        thread2.start();

        //join
        //it'll wait for a specified thread to die
        thread.start();
        thread.join();
        thread2.start();
    }
}
