package javaBase.oopCode.oopExer.otherExer;


/**
 * MethodTest
 */
/* public class MethodTest {

    public static void main(String[] args) {

        Person obj = new Person();
        obj.age = 5;
        System.out.println("初始化" + obj.age);

        change(obj);
        System.out.println("修改" + obj.age);

        
        
    }


public static void change(Person obj) {
            System.out.println("之前" + obj.age);
            obj.age = 3;
            System.out.println("之后" + obj.age);
        }

}
class Person{

    int age;
} */

/**
 * MethodTest
 */
public class MethodTest {

    public static void main(String[] args) {
        
        int x = 5;
        System.out.println("初始" + x);

        change(x);
        System.out.println("之后" + x);
    }

    public static void change(int x){
        x = 3;
        System.out.println("change之后" + x);
    }
}