package javaBase.oopCode.oopExer.keywordExer.abExer;

/**
 * salariedEmployee
 */
public class salariedEmployee extends Employee {

    private int monthlySalary;

    public salariedEmployee(String name ,int number , MyDate brithday,int monthlySalary){

        super(name, number, brithday);
        this.monthlySalary = monthlySalary;
    }

    public salariedEmployee(int monthlySalary){
        super();
        this.monthlySalary = monthlySalary;
    }

    @Override
    public int earnings(){
        return monthlySalary;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "salariedEmployee " + super.toString() + "]";
    }






    
}