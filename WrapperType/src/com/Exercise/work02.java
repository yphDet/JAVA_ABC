package com.Exercise;
//Integer创建机制
public class work02 {
    public static void main(String[] args) {
        Integer integer = new Integer(1);//手动装箱
        Integer integer1 = new Integer(1);
        System.out.println(integer1 == integer);//f

        System.out.println("++++++++++++++");
        Integer i = 1;//底层 Integer.valueOf(1); -> 阅读源码
        Integer j = 1;
        System.out.println(i == j);//t

        System.out.println("=============");
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);//f


    }
}
