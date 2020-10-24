package javaBase.oopCode.oopExer.otherExer;

/**
 * Person1
 */
public class Person1 {

    private int age ;

    public int getAge(){
        return age;
    }

    public void setAge(int a){

        if (a < 0 || a > 130) {
            System.out.println("输入不合法");
            return ;
        }
        age = a;
    }


}

