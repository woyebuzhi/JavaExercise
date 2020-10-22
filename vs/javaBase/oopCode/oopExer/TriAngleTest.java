package javaBase.oopCode.oopExer;

/**
 * TriAngleTest
 */
public class TriAngleTest {

    public static void main(String[] args) {
        TriAngle tri = new TriAngle(2.0,1.0);

        tri.setBase(2.0);
        tri.setHeight(5.0);

        System.out.println(tri.mianji());

    }
}