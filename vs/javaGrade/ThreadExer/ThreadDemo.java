package javaGrade.ThreadExer;

/**
 * ThreadDemo
 */


public class ThreadDemo {

    public static void main(String[] args) {
        
        MyThread1  t1 = new MyThread1();
        t1.setName("Thread-1");
        t1.start();

        MyThread2 t2 = new MyThread2();
        Thread t = new Thread(t2);
        t.setName("Thread-2");
        t.start();
    }
}

class MyThread1 extends Thread{

    @Override
    public void run(){

        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);

            }
    }}
}

class MyThread2 implements Runnable{

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            if(i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);

            }
    }
}}
