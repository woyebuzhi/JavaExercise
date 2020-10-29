package javaBase.oopCode.oopExer.keywordExer.abExer;

import java.util.Calendar;

/**
 * PayrollSystem
 */
public class PayrollSystem {
    public static void main(String[] args) {

    // 获得月

        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);



        Employee[] emps = new Employee[2];

        emps[0] = new salariedEmployee("Tom",1002,new MyDate(1999,1,1),100);
        emps[1] = new HourlyEmployee("Boy", 999, new MyDate(2000,2,2), 60, 200);

        for(int i = 0 ;i < emps.length; i++){

        }

        if((month + 1) == emps[1].getBrithday().getMonth()){
            System.out.println("奖励100");
        }


    }
    

}