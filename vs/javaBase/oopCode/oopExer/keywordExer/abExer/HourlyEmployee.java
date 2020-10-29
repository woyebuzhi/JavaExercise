package javaBase.oopCode.oopExer.keywordExer.abExer;

/**
 * HourlyEmployee
 */
public class HourlyEmployee extends Employee {

    private double wage;
    private double hour;

    public HourlyEmployee(double wage,double hour){
        super();
        this.wage =  wage;
        this.hour  = hour;

    }

    public HourlyEmployee(String name , int number, MyDate birthday,double wage,double hour){

        super(name,number,birthday);
        this.wage = wage;
        this.hour = hour;

    }

    public int earnings(){
        return (int) (this.wage * this.hour);
        
    }

    public String toString(){
        return "Hour" + super.toString();
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }


}