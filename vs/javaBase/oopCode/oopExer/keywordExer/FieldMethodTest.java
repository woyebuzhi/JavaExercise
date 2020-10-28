package javaBase.oopCode.oopExer.keywordExer;

/**
 * FieldMethodTest
 */
public class FieldMethodTest {
    public static void main(String[] args) {
        
        Sub s = new Sub();
        s.display();

        System.out.println("______________");

        Base b = s;
        System.out.println(b.count);
        b.display();
        //b.addDisplay();
    }
    
}

class Base{
    int count = 10;

    public void display(){
        System.out.println("Base" + count);
    }

}

class Sub extends Base{
    int count = 20;

    public void display(){
        System.out.println("Sub" + count);
    }

    public void addDisplay(){
        System.out.println("this is addDisplay");
    }

}

