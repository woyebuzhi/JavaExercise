//递归函数

package javaBase.oopCode.oopExer.otherExer;



/**
 * RecursionTest
 */
public class RecursionTest {

    public static void main(String[] args) {

        RecursionTest read = new RecursionTest();

        int x = 3;
        int sumNum = read.getSum(x);
        System.out.println(sumNum);

        
            
            
        
        
    }

    //递归方法
    public int getSum(int n){

        if(n == 1){
            return 1;

        }else {
            return n + getSum(n - 1);
        }
    }
}