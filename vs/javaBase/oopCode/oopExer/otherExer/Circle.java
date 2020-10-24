package javaBase.oopCode.oopExer.otherExer;

/**
 * Circle
 */
public class Circle {

    public static void main(final String[] args) {

        TestCircle c = new TestCircle();

        c.radius = 2;
        final double a = c.findArea();
        System.out.println(a);

    }
}

// 定义一个⚪的类
/**
 * testCircle
 */
class TestCircle {

    double radius;

    public double findArea() {
        final double area = Math.PI * radius * radius;
        return area; 

    }
    
}