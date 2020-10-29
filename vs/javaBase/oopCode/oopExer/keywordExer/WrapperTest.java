package javaBase.oopCode.oopExer.keywordExer;

/**
 * WrapperTest
 */
public class WrapperTest {

      //基本数据类型--》 包装类

      public void test1() {
            
        final int num1 = 10;
       // 无效的 System.out.println(num1.toString());

        final Integer i1 = new Integer(num1);
        System.out.println(i1.toString());

        final Integer i2 = new Integer("1234");
        System.out.println(i2.toString());

        final Boolean b1 = new Boolean(true);
        final Boolean b2 = new Boolean("TRUe");
        System.out.println(b1);
		System.out.println(b2);
		final Boolean b3 = new Boolean("true123");
		System.out.println(b3);//false
        
    }

    //包装类--》 基本数据类型
    public void test2() {

        final Integer in1 = new Integer(12);

        final int i3 = Integer.valueOf(in1);
        System.out.println(i3);

        
    }

    //自动拆装项
    public void test3() {

        final int i4 = 11;
        final Integer in4 = i4;
        System.out.println(in4.toString());

        final Integer in5 = 15;
        final int i5 = in5;
        System.out.println(i5);

        
    }

    //基本数据集类型，包装类--》 string

    public void test5() {
        
        final int i6 = 16;
        //Integer in6 = 16;

        final String s1 = String.valueOf(i6);
        System.out.println(s1);

        /* String s2 = String.valueOf(in6);
        System.out.println(in6.toString()); */


    }

    public static void main(final String[] args) {

        final WrapperTest t = new WrapperTest();
        t.test5();
        

      
    }
}