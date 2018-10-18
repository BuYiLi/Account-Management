package com.buyi.other;

import org.junit.Test;

public class OtherTest {

    public class myThread extends Thread{
        private int number = 10;

        public synchronized void first(){
            System.out.println("first met      hod is run...");
            number = number + 1;
        }

        public synchronized void second() throws InterruptedException {
            System.out.println("second method is run...");
            //Thread.sleep(1000);
            this.wait(1000);
            number = number * 10;
        }

        @Override
        public void run() {
            first();
        }
    }

    @Test
    public void threadTest() throws InterruptedException {
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        thread.start();


        myThread myThread = new myThread();
        myThread.start();
        myThread.second();

        Thread.sleep(10);
        System.out.println(myThread.number);
    }
}
