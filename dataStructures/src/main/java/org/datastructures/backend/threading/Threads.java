package org.datastructures.backend.threading;

//You can set the thread to daemon thread only before thread.start
//if you set the thread to deamon after .start()
//you'll encounter IllegalThreadStateException
public class Threads {

    public static void main(String[] args){

        MyThread thread = new MyThread();
        System.out.println(thread.isAlive());

        thread.setDaemon(true);
        System.out.println(thread.isDaemon());

        thread.start();
        System.out.println("After adding .start() "+thread.isAlive());

        System.out.println("Thread name: "+ thread.getName());

        thread.setName("My First Thread");
        System.out.println("Thread name after rename : "+ thread.getName());

        System.out.println("Thread's priority : "+ thread.getPriority());

//        thread.setPriority(1);
//        System.out.println("Thread's priority after set : "+ thread.getPriority());

    }
}
