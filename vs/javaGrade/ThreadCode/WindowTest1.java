
class win1 implements Runnable{
    private int ticket = 100;

    @Override
    public void run(){

        while(true){
            synchronized(this){
                if(ticket > 0){

                    try {
                        Thread.sleep(100);

                    }catch(InterruptedException e){

                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "票号为：" +ticket );

                    ticket--;

                }else{
                    break;
                }
            }
        }
    }
}

/**
 * WindowTest1
 */
public class WindowTest1 {

    public static void main(String[] args) {
        win1 w = new win1();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);


        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}