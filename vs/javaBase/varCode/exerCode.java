package javaBase.varCode;
import java.util.Scanner;



class exerCode{
    public static void main(String[] args) {
        /* 一个数不同位置的值
        int num  = 189;

        int b = num /100 ;
        int s = num % 100 /10;
        int g = num % 10;

        System.out.println(b);
        System.out.println(s);
        System.out.println(g); */

        /*byte bb1 =127;
		bb1++;
        System.out.println("bb1 = " + bb1);
        
        int a4 = 10;
		int b4 = a4--;//int b4 = --a4;
        System.out.println("a4 = " + a4 + ",b4 = " + b4);*/
        
     /*   for (int i = 1;i <=150;i++){

           System.out.print(i);
           if(i % 3 == 0){
               System.out.print("foo");
           }
           if(i % 5 ==0){
               System.out.print("biz");
           }
           System.out.println();
       }
 */

Scanner scan = new Scanner(System.in);
		
int positiveNumber = 0;//记录正数的个数
int negativeNumber = 0;//记录负数的个数

for(;;){//while(true){
    
    int number = scan.nextInt();

    //判断number的正负情况
    if(number > 0){
        positiveNumber++;
    }else if(number < 0){
        negativeNumber++;
    }else{
        //一旦执行break，跳出循环
        break;
    }

}

System.out.println("输入的正数个数为：" + positiveNumber);
System.out.println("输入的负数个数为：" + negativeNumber);

scan.close();
    }
}
