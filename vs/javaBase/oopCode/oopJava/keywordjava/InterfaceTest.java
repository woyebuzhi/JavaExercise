package javaBase.oopCode.oopJava.keywordjava;

import java.io.IOException;



/**
 * InterfaceTest
 */
public class InterfaceTest {

    public static void main(final String[] args) {

        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);

        final Plane plane = new Plane();
        plane.fly();

    }
}

interface Flyable {

    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1;

    public abstract void fly();

    void stop();

}

interface Attackable {

    void attack();
}

class Plane implements Flyable {

    @Override
    public void fly() {
        System.out.println("通过引擎飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速");
    }

}

abstract class Kite implements Flyable {
    @Override
    public void fly() {

    }
}

class Bullet extends Object implements Flyable, Appendable, CC {

    @Override
    public void fly() {
        

    }

    @Override
    public void stop() {
       

    }

    @Override
    public Appendable append(final CharSequence csq) throws IOException {
        
        return null;
    }

    @Override
    public Appendable append(final char c) throws IOException {
     
        return null;
    }

    @Override
    public Appendable append(final CharSequence csq, final int start, final int end) throws IOException {
        
        return null;
    }

    @Override
    public void method() {
       

    }

    @Override
    public void method1() {
      

    }

 
}

interface AA{
    void method();
}

interface BB {

    void method1();
}

interface CC extends AA,BB{
    
}

