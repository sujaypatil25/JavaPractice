package org.example;

public class ThreadClass extends Thread{
    @Override
    public void run() {
        for(int i=1;i<5;i++){
            System.out.println("ThreadClass "+System.nanoTime());
            try {
                Thread.sleep(1234);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
