package com.detail;

import java.util.ArrayList;
import java.util.Comparator;

public class Exercise {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("jack",6000,new MyDate(2000,10,10)));
        employees.add(new Employee("yph",15000,new MyDate(2004,5,9)));
        employees.add(new Employee("yph",25000,new MyDate(2004,2,9)));
        System.out.println("employees = " + employees);

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int i = o1.getName().compareTo(o2.getName());
                if (i != 0)
                    return i;
                //在Mydate类中编写一个比较方法可以提高代码的复用型，以及便于维护。
                //【封装特性】
                int n = o1.getBirthday().compareTo(o2.getBirthday());
                if (n != 0){
                    return n;
                }
                return 0;
            }
        });
        System.out.println(employees);
    }
}
class Employee{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
class MyDate{
    private int month;
    private int day;
    private int year;

    public MyDate(int year, int month, int day) {
        this.month = month;
        this.day = day;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int compareTo(MyDate md){
        int years = year - md.year;
        if (years != 0) {
            return years;
        }

        int months = month - md.month;
        if (months != 0){
            return months;
        }

        int days = day - md.day;
        if (days != 0){
            return days;
        }

        return 0;
    }


    @Override
    public String toString() {
        return "MyDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
}
