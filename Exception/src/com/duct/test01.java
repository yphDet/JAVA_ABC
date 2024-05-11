package com.duct;

public class test01 {
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 0;
        //int ret = n1 / n2;//运行异常（算术异常ArithmticException）
        /*
        解读：
        1、当执行到n1/n2因为 n2 = 0，程序就会出现（抛出）异常
        2、当抛出异常后，程序就退出，崩溃了，下面代码就不在执行。
         */
        System.out.println("未学异常前");

        //异常的引出：
        /*
        1、出现了一个不算致命的问题，就导致系统崩溃。例如上面的代码
        2、java设计者，提供了一个叫异常处理机制来解决该问题
         */

        //如果程序员，认为一段代码可能出现异常/问题，可以使用异常处理机制来解决
        //从而保证程序的健壮性

        //使用try-catch(-finally)这种异常处理机制，快捷创建方式
        //将代码->选中->快捷键 ctrl + alt + t  选择需要的
        try{
            int ret = n1 / n2;//运行异常（RuntimeExerption）
        } catch (Exception e) {
            //为什么下面这行代码的语句是在执行完System.out.println("正在学习异常");之后执行呢？
            //与hsp演示的不一致。
            e.printStackTrace();
            //System.out.println("出现异常的原因：" + e.getMessage());

        }
        System.out.println("正在学习异常");


    }
}

