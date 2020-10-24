package javaBase.oopCode.oopExer.otherExer;

/**
 * TriAngle
 */
public class TriAngle {

    private double base;
    private double height;

    //构造器
    public TriAngle() {

        System.out.println("这个是通过多参构造器调用的空参构造器");
    }

    public TriAngle(double b,double  h){
        this();
        base = b;
        height = h;

    }

    
    public void setBase(double b){
        base = b;

    }

    public void setHeight(double he){
        height = he;
    }

    public double getBase(){
        return base;
    }

    public double getHeight(){
        return height;
    }

    public double mianji(){
        return base * height / 2;
        }

}