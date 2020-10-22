package javaBase.oopCode.oopExer.OiderSuperExer;



/**
 * Cylinder
 */
public class Cylinder extends Circle {

    private double length;

    public Cylinder(){}

    public Cylinder(double length){
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){

        return super.findArea() * getLength();
        
    }

    //重写父方法 球的表面积
    @Override
    public double findArea(){
        return Math.PI * getLength()  * getLength() ;

    }


}