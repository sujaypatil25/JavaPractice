package org.example;

public class Main {
    public static void main(String[] args) {

        /* Example of Threads by extending Thread Class*/
        ThreadClass threadClass=new ThreadClass();
        threadClass.start();

        /* Example of Threads by implementing Runnable Interface*/
        RunnableInterface runnableInterface=new RunnableInterface();
        Thread thread=new Thread(runnableInterface);
        thread.start();

        /* Example of Threads using Anonymous Inner Class*/
        Runnable runnable=new RunnableInterface(){
            @Override
            public void run() {
                for(int i=1;i<5;i++){
                    System.out.println("Anonymous Runnable "+System.nanoTime());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread thread1=new Thread(runnable);
        thread1.start();


        /* Example of Threads using Lambda*/
        Runnable runnable1 = ()->{
            for(int i=1;i<5;i++){
                System.out.println("Runnable using Lambda "+System.nanoTime());
                try {
                    Thread.sleep(1700);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread2=new Thread(runnable1);
        thread2.start();
    }
}