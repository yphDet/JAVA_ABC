package com.Exercise;

public class test04 {
    public static void main(String[] args) {
        //在Java中Object类是所有类的基类。
        Object obj = new Date();
        Person person = (Person)obj;//类型转换异常
        System.out.println(person);
    }
}
class Date{}
class Person{}
