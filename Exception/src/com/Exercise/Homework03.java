package com.Exercise;

public class Homework03 {
    public static void func(){
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("B");
        }
    }

    public static void main(String[] args) {
        try {
            func();//抛出异常后就不再执行try块接下的代码
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("C");
        }
        System.out.println("D");
    }
}
