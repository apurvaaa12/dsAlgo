package org.datastructures.backend.threading;

public class MyThread extends Thread{


    @Override
    public void run(){
        if(this.isDaemon()){
            System.out.println("It's a daemon thread!");
        }else{
            System.out.println("Inside My Thread");
        }
    }
}
