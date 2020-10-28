package javaBase.oopCode.oopExer.keywordExer.abExer;

/**
 * Employee
 */
public abstract class Employee {

    private String name;
    private int number;
    private MyDate brithday;
    
    public Employee(){}
    public Employee(String name, int number , MyDate brithday){

        this.name = name;
        this.number = number;
        this.brithday = brithday;
    }

    abstract int earnings();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBrithday() {
        return brithday;
    }

    public void setBrithday(MyDate brithday) {
        this.brithday = brithday;
    }

    @Override
    public String toString() {
        return "brithday=" + brithday.toDateString() + ", name=" + name + ", number=" + number + "]";
    }

    
}