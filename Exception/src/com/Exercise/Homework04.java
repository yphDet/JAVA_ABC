package com.Exercise;

public class Homework04 {
    public static void main(String[] args) {
        try{//这里在使用了try方式处理机制，如果没有使用的话要在调用方法抛出异常
            showExce();
            System.out.println("A");
        }catch (Exception e){
            System.out.println("B");
        }finally {
            System.out.println("C");
        }
        System.out.println("D");
    }
    public static void showExce() throws Exception{//自定义异常抛出的属于编译异常
        throw new Exception();
    }
}
