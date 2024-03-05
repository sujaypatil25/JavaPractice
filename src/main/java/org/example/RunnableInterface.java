package org.example;

public class RunnableInterface implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<5;i++){
            System.out.println("RunnableInterface "+System.nanoTime());
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
