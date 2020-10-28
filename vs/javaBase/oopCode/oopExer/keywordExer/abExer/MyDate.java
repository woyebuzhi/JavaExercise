package javaBase.oopCode.oopExer.keywordExer.abExer;

/**
 * MyDate
 */
public class MyDate {

    private int year;
    private int month;
    private int day;

    
    public String toDateString() {
        return year + "年" + month + "月" + day + "日";
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }


    
}