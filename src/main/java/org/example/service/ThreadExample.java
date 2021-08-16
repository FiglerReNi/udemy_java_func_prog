package org.example.service;

public class ThreadExample implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 10000; i++){
            System.out.println(Thread.currentThread().getId() + ": " + i);
        }
    }
}
