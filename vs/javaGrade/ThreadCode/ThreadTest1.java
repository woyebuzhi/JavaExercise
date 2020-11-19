package javaGrade.ThreadCode;

/**
 * ThreadTest1
 */

class MThread implements Runnable{

    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

        }
    
    }
}

public class ThreadTest1 {

    public static void main(String[] args) {
        
        MThread mt = new MThread();
        Thread t1 = new Thread(mt);

        t1.setName("线程1");
        t1.start();

        Thread t2 = new Thread(mt);
        t2.setName("Thread-2");
        t2.start();


    }
}