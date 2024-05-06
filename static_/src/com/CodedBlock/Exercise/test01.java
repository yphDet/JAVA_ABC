package com.CodedBlock.Exercise;

public class test01 {
    public static void main(String[] args) {
//        static代码块也叫静态代码块，作用就是对类进行初始化，而且它随着类的加载
//        而执行，并且指挥执行一次；
        System.out.println("total =" + Person.total);//101
        System.out.println("total =" + Person.total);//101
    }
}
class Person{
    public static int total;
    static{
        total = 100;
        total++;
        System.out.println("in static block" );
    }
}
