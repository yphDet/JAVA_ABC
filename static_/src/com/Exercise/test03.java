package com.Exercise;

public class test03 {
    public static void main(String[] args) {
        Person.setTotalPerson(3);//3
        System.out.println(new Person().total);//4
    }
}
class Person{
    private int id;
    static int total = 0;
    public static void setTotalPerson(int total){
        //类方法中不能使用与对象有关的关键字；
        //this.total = total;

        Person.total = total;
    }
    public Person(){
        total++;
        id = total;
    }
}