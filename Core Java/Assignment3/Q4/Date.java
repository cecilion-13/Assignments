package co.harsh.Assignment3.Q4;

import java.util.Objects;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date getDate() {
        return new Date(this.day,this.month,this.year);
    }

    public void setDate(int day,int month,int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date = (Date) o;
        return day==date.day && month==date.month ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month);
    }

    @Override
    public String toString() {
        return "Date: " + day + "/" + month +
                "/" + year ;
    }

    public static void main(String[] args) {
        Date date = new Date(01,02,2012);
        Date date1 = date.getDate();
        System.out.println(date1);
    }
}
