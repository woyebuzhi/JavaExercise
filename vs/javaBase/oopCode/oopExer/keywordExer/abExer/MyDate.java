package javaBase.oopCode.oopExer.keywordExer.abExer;

/**
 * MyDate
 */
public class MyDate {

    private int year;
    private int month;
    private int day;

    public MyDate(){

    }

    public MyDate(final int year, final int month, final int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toDateString() {
        return year + "年" + month + "月" + day + "日";
    }

    public int getYear() {
        return year;
    }

    public void setYear(final int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(final int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(final int day) {
        this.day = day;
    }


    
}