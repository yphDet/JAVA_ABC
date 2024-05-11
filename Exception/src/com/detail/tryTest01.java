package com.detail;

public class tryTest01 {
    public static void main(String[] args) {

        //解读：try-catch-final的基本介绍
        /*
        1、如果try块中异常发生了，则异常发生后的try块其他代码不会执行，直接进入catch块
        2、如果异常没有发生，则顺序执行try块中代码，不会进入catch
        3.如果希望不管是否发生异常，都执行某段代码则在finally块中编译；
         */
        try {
            String str = "ss";
            int num = Integer.parseInt(str);//数字格式异常
            System.out.println("num=" + num);
        } catch (NumberFormatException e) {//得到异常对象对象后，程序员，直接处理
            System.out.println("异常信息：" + e.getMessage());
        }finally {
            System.out.println("finally块被执行");
        }
        System.out.println("在异常处理方式后的代码");
    }
}
