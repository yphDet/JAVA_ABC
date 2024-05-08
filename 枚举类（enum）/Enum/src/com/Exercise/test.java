package com.Exercise;


public class test {
    public static void main(String[] args) {
        Gender2 boy = Gender2.BOY;
        Gender2 boy1 = Gender2.BOY;
        System.out.println(boy);//本质就是调用 Gender2 的父类的 toString（）
        System.out.println(boy1 == boy);
        //解读：（我的理解）
        /*
        = 号 右边是枚举对象[地址]；
             左边是变量【编译类型是类（Gender2） 变量名】
         */
    }
}
enum Gender2{
    BOY,GIRL;
}
