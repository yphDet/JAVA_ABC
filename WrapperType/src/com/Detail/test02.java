package com.Detail;
//jdk5后的自动装箱和拆箱的演示
public class test02 {
    public static void main(String[] args) {
        //自动装箱
        int i = 1;
        Integer integer = i;//底层使用的是 Integer.valueOf(i);
        System.out.println(integer);

        //自动拆箱
        int t = integer;//底层使用的是 intValue方法；
        System.out.println(t);
    }
}
