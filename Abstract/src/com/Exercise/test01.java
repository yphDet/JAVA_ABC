package com.Exercise;

public class test01 {
    public static void main(String[] args) {
        Manager ph = new Manager("ph", 124, 25000, 5000);
        ph.work();
    }
}
abstract class Employee{
    private String name;
    private int id;
    private double salary;
    public int a = 1;
    public abstract void work();

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class Manager extends Employee{
    private double bonus;
//父类的默认构造器被覆盖了，子类要主动调用父类的构造器
    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);//super关键字
        this.bonus = bonus;
    }

    public void work(){
        System.out.println("经理" + getName() + "工作中");
    }
}