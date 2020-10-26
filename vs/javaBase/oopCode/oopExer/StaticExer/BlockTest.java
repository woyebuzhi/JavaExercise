package javaBase.oopCode.oopExer.StaticExer;

/**
 * BlockTest
 */
public class BlockTest {

    public static void main(String[] args) {

        String desc = Person.desc;
        System.out.println(desc);

        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1.age);

        Person.info();
        
    }
}

class Person{

    String name;
    int age;

    static String desc = "我是xjw";

    public Person(){

    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;

    }

    {//非static代码块
        System.out.println("非static -1");
    }

    {
        System.out.println("非static -2");

        age = 1;
        eat();
        desc = "我爱学习";
        info();
    }

    static{
        System.out.println("static代码块 -2");
    }
    static{

        System.out.println("static -1");
        desc = "我是爱学习的人";
        info();
    }

    public void eat(){

        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }

    public static void info(){

        System.out.println("happy");
    }

    
    


}