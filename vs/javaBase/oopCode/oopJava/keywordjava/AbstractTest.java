package javaBase.oopCode.oopJava.keywordjava;



/**
 * AbstractTest
 */
public class AbstractTest {

    public static void main(String[] args) {
        Student s = new Student("Tom",18);
        s.breath();

        //Creature c = new Creature(){};
        
    }
}
    
abstract class Creature{

    public abstract void breath();
}

abstract class Person extends Creature{
    String name;
    int age;

    public Person(){}

    public Person(String name , int age){

        this.age = age;
        this.name = name;

    }

    public abstract void eat();

    public  void walk(){

        System.out.println("人走路");
    }

}

class Student extends Person{

    public Student(String name, int age){

        super(name,age);
    }

    public Student(){}

    public void eat(){
        System.out.println("学生吃肉");
    }

    @Override
    public void breath(){

        System.out.println("学生呼吸空气");
    }
}