package javaBase.oopCode.oopExer.OiderSuperExer;

/**
 * CylinderTest
 */
public class CylinderTest {

    public static void main(String[] args) {
        Cylinder cy = new Cylinder();

        cy.setLength(2.0);
        cy.setRadius(5.0);

        double area = cy.findArea();
        System.out.println("⚪的表面积是：" + area);
        
    }
}