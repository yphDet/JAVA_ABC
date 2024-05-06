package com.Exercise;

public class test02 {
    public static void main(String[] args) {
        System.out.println("Number of total is " + Person00.getTotalPerson00());//0
        Person p1 = new Person();
        System.out.println("Number of total is " + Person00.getTotalPerson00());//1

    }
}
class Person00{
    private int id;
    private static int total = 0;
    public static int getTotalPerson00(){
        //类方法只能调用类变量（方法）
        //错误id++;
        return total;
    }

    public Person00() {
        total++;
        id = total;
    }
}