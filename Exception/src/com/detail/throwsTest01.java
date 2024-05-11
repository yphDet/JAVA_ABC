package com.detail;
//编译异常  用throws方式的处理方式的解读
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class throwsTest01 {

    public static void main(String[] args) {

    }

    public static void f1() throws Exception{
        f2();//f2方法中出现了编译异常
        //throws方式处理异常是将调用f2方法的调用者（方法）处理  就是这里的f1方法

    }
    //在方法声明中用throws语句可以抛出异常的列表，throws后面的异常类型
    //可以是方法中产生的异常类型，也可以是父类

    public static void f2() throws Exception{//当前异常类型的具体方法的父类
    //public static void f2() throws FileNotFoundException,ArrayIndexOutOfBoundsException{//抛出异常的列表
    // public static void f2() throws FileNotFoundException{//抛出当前异常的具体是什么异常
        //编译异常，程序必须处理，用try方式或者throws方式
//        try {
//            FileInputStream fileInputStream = new FileInputStream("d://");//编译异常
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        //用throws方式解读
        /*
        1、这里的异常是一个FileNotFoundException编译异常
        2、可以使用上面代码来解决这个问题，这里用throws方式
        3、使用throws，抛出异常，让调用f2方法的调用者（方法）处理
         */
        FileInputStream fileInputStream = new FileInputStream("d://");//编译异常
    }

}
