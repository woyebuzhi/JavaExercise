package javaBase.oopCode.oopExer.otherExer;

/**
 * PersonTest
 */
public class PersonTest {

    public static void main(String[] args) {
        
        Person1 per = new Person1();

        per.setAge(155);
        int age = per.getAge();
        System.out.println(age);
    }
}