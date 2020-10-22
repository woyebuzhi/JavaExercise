package javaBase.oopCode.oopExer.OiderSuperExer;

/**
 * ManKind
 */
public class ManKind {

    private int sex;
    private int salary;

    public ManKind() {

    }

    public ManKind(int sex,int salary){
        this.sex = sex;
        this.salary = salary;
    }
    
    public void manOrWoman(int sex){
        if (sex == 1) {
            System.out.println("man");
        } else if(sex == 0){
            System.out.println("woman");
        }
    }

    public void employeed(int salary){
        if (salary == 1) {
            System.out.println("no job");
        } else if(salary == 0){
            System.out.println("job");
        }
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}