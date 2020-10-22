package javaBase.oopCode.oopExer.OiderSuperExer;

/**
 * Kids
 */
public class Kids extends ManKind {
    private int yearOld;

    public Kids(){}

    public Kids(int yearOld){
        this.yearOld = yearOld;
    }

    public void printAge(){
        System.out.println("yearOld is " + yearOld);
    }

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

}