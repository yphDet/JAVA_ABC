package com.Detail;
//基本数据类型与包装类之间转换
//jdk5前的手动装箱和拆箱；
public class test01 {
    public static void main(String[] args) {
        //演示 int -> Integer 的装箱和拆箱

        //jdk5前的手动装箱 和 手动拆箱

        //手动装箱
        int n1 = 10;
        Integer integer1 = Integer.valueOf(n1);//底层执行代码
        System.out.println(integer1);
        Integer integer = new Integer(n1);//自动装箱
        System.out.println(integer);

        //手动拆箱
        int n = integer.intValue();//底层执行代码



    }
}
